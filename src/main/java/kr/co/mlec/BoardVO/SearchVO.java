package kr.co.mlec.BoardVO;

public class SearchVO {
	private int pageNo;
	private int start;
	private int end;
	private String call;
	
	public SearchVO() {
		pageNo = 1;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "SearchVO [pageNo=" + pageNo + ", start=" + start + ", end="
				+ end + ", call=" + call + "]";
	}
}
