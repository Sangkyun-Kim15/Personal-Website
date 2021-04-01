package kr.co.mlec.BoardVO;

public class PageVO {
	private static final int TAB_SIZE = 3;
	private static final int LIST_SIZE = 3;

	private int count;
	private int pageNo;
	private int lastPage;
	private int currTab;
	private int beginPage;
	private int endPage;
	private String url;
	
	public PageVO(String url, int pageNo, int count) {
		this.url = url;
		this.pageNo = pageNo;
		
		lastPage = (count % LIST_SIZE == 0) ? count / LIST_SIZE : count / LIST_SIZE + 1;
		currTab = (pageNo - 1) / TAB_SIZE + 1;
		beginPage = (currTab - 1) * TAB_SIZE + 1;
		endPage = (currTab * TAB_SIZE >= lastPage) ? lastPage : currTab * TAB_SIZE;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getCurrTab() {
		return currTab;
	}

	public void setCurrTab(int currTab) {
		this.currTab = currTab;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static int getTabSize() {
		return TAB_SIZE;
	}

	public static int getListSize() {
		return LIST_SIZE;
	}

	@Override
	public String toString() {
		return "PageVO [count=" + count + ", pageNo=" + pageNo + ", lastPage="
				+ lastPage + ", currTab=" + currTab + ", beginPage="
				+ beginPage + ", endPage=" + endPage + ", url=" + url + "]";
	}
}