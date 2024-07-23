package _20010310052_Irem_Ozgoren;

class _20010310052_Proses {
	   public static int nextPid = 1000;
	    String name;
	    int startTime;
	    int endTime;
	    int dataSize;
	    int codeSize;
	    int stackSize;
	    int heapSize;
	    int totalSize;
	    int pid;

	    public _20010310052_Proses(String data) {
	        String[] values = data.split(" ");
	        this.name = values[0];
	        this.startTime = Integer.parseInt(values[1]);
	        this.endTime = Integer.parseInt(values[2]);
	        this.dataSize = Integer.parseInt(values[3]);
	        this.codeSize = Integer.parseInt(values[4]);
	        this.stackSize = Integer.parseInt(values[5]);
	        this.heapSize = Integer.parseInt(values[6]);
	        this.totalSize = dataSize + codeSize + stackSize + heapSize;
	        this.pid = nextPid +3;
	    }

	    @Override
	    public String toString() {
	        return "Proses numarasi: " + pid + "\n" +
	                "Prosesin yaratilma zamani: " + startTime + ". saniye\n" +
	                "Prosesin toplam buyuklugu: " + totalSize + " KB";
	    }
	}