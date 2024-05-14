public class Hinhtron {
    public class ToaDo {
       public int toaDo;
        public int x;
        public int y;
        }
float r ;
public Hinhtron.ToaDo toaDo;
void setBanKinh(float r){
    this.r = r;

}
void setToado(ToaDo  toaDo){
    this.toaDo = toaDo;

}
void settoaDo(int x , int y ){
    this.toaDo.x = x;
    this.toaDo.y = y;
}
void xuatBanKinh(){
    System.out.println("Ban Kinh Hinh Tron:" + this.r);
}
void xuatToaDo(){
    System.out.println("Toa Do Hinh Tron:");
    System.out.println("x =" + this.toaDo.x);
    System.out.println("y =" + this.toaDo.y);
}

}
