class Idol
{
	String ho_ten;
	int tuoi;
	double chieu_cao, can_nang;

	public void gioi_thieu_ten()
	{
		System.out.println("Xin chao! Toi la " + ho_ten);
	}

	public String tinh_trang_lao_dong()
	{
		int min = 18;
		int max = 30;
		String ket_qua;
		
		if(tuoi < min)
		{
			ket_qua = "Chua du tuoi lao dong";
		}
		else if(tuoi > max)
		{
			ket_qua = "Het date";
		}
		else 
		{
			ket_qua = "Trong do tuoi lao dong";
		}
		return ket_qua;
	}
}
