package logic;

 public class Card {

     private String code;
    private String image;
    private Images images;
    private String value;
    private String suit;

     public String getCode() {
         return code;
     }

     public void setCode(String code) {
         this.code = code;
     }

     public String getImage() {
         return image;
     }

     public void setImage(String image) {
         this.image = image;
     }

     public Images getImages() {
         return images;
     }

     public void setImages(Images images) {
         this.images = images;
     }

     public String getValue() {
         return value;
     }

     public void setValue(String value) {
         this.value = value;
     }

     public String getSuit() {
         return suit;
     }

     public void setSuit(String suit) {
         this.suit = suit;
     }
    // Add getters and setters (or Lombok annotations) for the fields.
}

 class Images {
     private String svg;
     private String png;
     public String getSvg() {
         return svg;
     }

     public void setSvg(String svg) {
         this.svg = svg;
     }

     public String getPng() {
         return png;
     }

     public void setPng(String png) {
         this.png = png;
     }



    // Add getters and setters (or Lombok annotations) for the fields.
}
