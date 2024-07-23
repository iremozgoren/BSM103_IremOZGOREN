package _20010310052_Irem_Ozgoren;

import java.util.*;
import java.io.*;

class _20010310052_RAM {
	private final int OS_BOYUTU = 1000 * 1024;
	private final int RAM_BOYUTU = 1000 * 1024 * 16;
	private List<_20010310052_Proses> prosesler;
	private BitSet bellek;
	private Map<Integer, Integer> prosesBaslangicHaritasi;

	public _20010310052_RAM() {
		this.prosesler = new ArrayList<>();
		this.bellek = new BitSet(RAM_BOYUTU);
		this.prosesBaslangicHaritasi = new HashMap<>();
		this.bellek.set(0, OS_BOYUTU);
	}

	public int kbToByteCevir(int sizeInKb) {
		return sizeInKb * 1024;
	}

	public void prosesleriYukle(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		while (scanner.hasNextLine()) {
			_20010310052_Proses proses = new _20010310052_Proses(scanner.nextLine());
			prosesler.add(proses);
		}
		scanner.close();
	}

	public boolean bellekAyrilimiYap(_20010310052_Proses proses) {
		int prosesBoyutuByte = kbToByteCevir(proses.totalSize);
		int baslangicIndeksi = prosesBaslangicHaritasi.isEmpty() ? OS_BOYUTU
				: prosesBaslangicHaritasi.values().stream().max(Integer::compare).get() + 1;
		int bitisIndeksi = baslangicIndeksi + prosesBoyutuByte;
		if (bitisIndeksi <= RAM_BOYUTU) {
			boolean bosAlanVarMi = bellek.nextClearBit(baslangicIndeksi) == baslangicIndeksi;
			if (bosAlanVarMi) {
				bellek.set(baslangicIndeksi, bitisIndeksi);
				prosesBaslangicHaritasi.put(proses.pid, baslangicIndeksi);
				System.out.println(proses.name + " programin ismi " + baslangicIndeksi + " ve " + (bitisIndeksi - 1)
						+ " adresleri arasinda yer ayrildi.");
				return true;
			}
		}
		return false;
	}

	public void bellekAyriliminiIptalEt(_20010310052_Proses proses) {
		Integer baslangicIndeksi = prosesBaslangicHaritasi.get(proses.pid);
		if (baslangicIndeksi != null) {
			int bitisIndeksi = baslangicIndeksi + kbToByteCevir(proses.totalSize);
			bellek.clear(baslangicIndeksi, bitisIndeksi);
			prosesBaslangicHaritasi.remove(proses.pid);
			System.out.println(proses.name + " programi icin ayirilan yer " + baslangicIndeksi + " ve "
					+ (bitisIndeksi - 1) + " adresleri arasinda serbest birakildi±.");
		}
	}

	public void simulasyonuCalistir() {
		Timer zamanlayici = new Timer();
		StringBuilder simulasyonSonuclari = new StringBuilder();
		for (_20010310052_Proses proses : prosesler) {
			TimerTask baslamaGorevi = new TimerTask() {
				@Override
				public void run() {
					if (bellekAyrilimiYap(proses)) {
						simulasyonSonuclari.append(proses.name).append(" ");
					}
				}
			};
			TimerTask bitisGorevi = new TimerTask() {
				@Override
				public void run() {
					bellekAyriliminiIptalEt(proses);
					simulasyonSonuclari.append(proses.name).append(" ");
				}
			};
			zamanlayici.schedule(baslamaGorevi, proses.startTime * 1000L);
			zamanlayici.schedule(bitisGorevi, proses.endTime * 1000L);
		}

		zamanlayici.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println(simulasyonSonuclari.toString());
				zamanlayici.cancel();
			}
		}, prosesler.get(prosesler.size() - 1).endTime * 1000L + 1000);
	}

	public void bellekDurumunuGoster(int second) {
		System.out.println(second + ". Saniyede RAM'in dolu olan kisimlari:");
		System.out.println("0. Ve " + (OS_BOYUTU - 1) + ". Adresler arasinda isletim sistemi bulunmaktadir.");
		int suankiAdres = OS_BOYUTU;
		for (_20010310052_Proses proses : prosesler) {
			if (proses.startTime <= second && proses.endTime >= second) {
				int baslangicAdresi = suankiAdres;
				int bitisAdresi = baslangicAdresi + kbToByteCevir(proses.totalSize) - 1;
				System.out.println(baslangicAdresi + ". Ve " + bitisAdresi + ". Adresler arasinda " + proses.name
						+ " programi bulunmaktadir.");
				suankiAdres = bitisAdresi + 1;
			}
		}
		System.out.println("PCB'si bulunan Prosesler: " + aktifProsesleriGetir(second));
	}

	public void prosesPCBGoster(String processName, int second) {
		_20010310052_Proses proses = prosesAdinaGoreBul(processName);
		if (proses != null && proses.startTime <= second && proses.endTime >= second) {
			System.out
					.println(processName + " isimli prosesin " + second + ". Saniyedeki PCB bilgileri su sekildedir:");
			System.out.println(proses);
		} else {
			System.out.println("Belirtilen isimde bir proses " + second + ". saniyede ulasilamadi.");
		}
	}

	private _20010310052_Proses prosesAdinaGoreBul(String processName) {
		for (_20010310052_Proses proses : prosesler) {
			if (proses.name.equals(processName)) {
				return proses;
			}
		}
		return null;
	}

	private String aktifProsesleriGetir(int second) {
		StringBuilder aktifProsesler = new StringBuilder();
		for (_20010310052_Proses proses : prosesler) {
			if (proses.startTime <= second && proses.endTime >= second) {
				aktifProsesler.append(proses.name).append(", ");
			}
		}
		return aktifProsesler.toString();
	}}