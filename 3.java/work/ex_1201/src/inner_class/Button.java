package inner_class;

public class Button {

	interface OnclickListener{
		void onClick();
	}
	
	private OnclickListener onclickListener;
	
	void setOnclickListener(OnclickListener listener) {
		this.onclickListener = listener; 
	}
	
	public void click() {
		onclickListener.onClick();
	}
}
