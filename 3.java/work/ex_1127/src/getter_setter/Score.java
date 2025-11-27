package getter_setter;

public class Score {

	private int kor;
	private int eng;
	private int math;
	
	// bam tu dong getter va setter
	//bam chuot phai -> source -> Generate Getters & Setters 
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor<0 || kor>100) {
			System.out.println("점수는 0~100사이여야 한다.");
		}
		this.kor = kor;
	}

	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng<0 || eng>100) {
			System.out.println("점수는 0~100사이여야 한다.");
		}
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math<0 || math>100) {
			System.out.println("점수는 0~100사이여야 한다.");
		}
		this.math = math;
	}
	
	public int getTotal() {
		return kor + math + eng;
	}
	
	public double getAverage() {
		return getTotal()/3.0;
	}
}

