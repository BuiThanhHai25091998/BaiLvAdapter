package onlai.dmt.com;

public class Trai_cay {
    private String Ten_Tri;
    private String Mo_ta;
    private int Hinh_Trai;

    public Trai_cay(String ten_Tri, String mo_ta, int hinh_Trai) {
        Ten_Tri = ten_Tri;
        Mo_ta = mo_ta;
        Hinh_Trai = hinh_Trai;
    }

    public String getTen_Tri() {
        return Ten_Tri;
    }

    public void setTen_Tri(String ten_Tri) {
        Ten_Tri = ten_Tri;
    }

    public String getMo_ta() {
        return Mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        Mo_ta = mo_ta;
    }

    public int getHinh_Trai() {
        return Hinh_Trai;
    }

    public void setHinh_Trai(int hinh_Trai) {
        Hinh_Trai = hinh_Trai;
    }
}
