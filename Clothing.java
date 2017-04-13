/**
 * Created by Chase on 2/26/2017.
 */


public class Clothing {

    private String waist;
    private String chest;
    private String neck;
    private String inseam;
    private String height;
    private String description;
    private String currentPrice;
    private String originalPrice;
    private String season;
    private String gender;
    private String style;
    private String material;
    private String iteration;
    private String styleNumber;
    private String color;
    private String size;
    private String sKU;
    private ColorUtils colorPicker;

    //Constructors

    public Clothing() {
        waist = null;
        chest = null;
        neck = null;
        inseam = null;
        height = null;
        description = null;
        currentPrice = null;
        originalPrice = null;
        season = null;
        gender = null;
        style = null;
        material = null;
        iteration = null;
        styleNumber = null;
        color = null;
        size = null;
        sKU = null;
    }

    public Clothing(String styleNumber, String iteration, String material, String style, String gender, String season, String itemNumber) {
        this.styleNumber = styleNumber;
        this.iteration = iteration;
        this.material = material;
        this.style = style;
        this.gender = gender;
        this.season = season;
    }

    public Clothing(String itemNumber, String season, String gender, String style, String material, String iteration, String styleNumber, String color, String size, String sKU) {
        this.season = season;
        this.gender = gender;
        this.style = style;
        this.material = material;
        this.iteration = iteration;
        this.styleNumber = styleNumber;
        this.color = color;
        this.size = size;
        this.sKU = sKU;
    }

    public Clothing(String waist, String chest, String neck, String inseam, String height, String itemNumber, String description, String currentPrice, String originalPrice, String season, String gender, String style, String material, String iteration, String styleNumber, String color, String size, String sKU) {
        this.waist = waist;
        this.chest = chest;
        this.neck = neck;
        this.inseam = inseam;
        this.height = height;
        this.description = description;
        this.currentPrice = currentPrice;
        this.originalPrice = originalPrice;
        this.season = season;
        this.gender = gender;
        this.style = style;
        this.material = material;
        this.iteration = iteration;
        this.styleNumber = styleNumber;
        this.color = color;
        this.size = size;
        this.sKU = sKU;
    }

    //Getters

    public String getWaist() { return waist; }

    public String getChest() {
        return chest;
    }

    public String getNeck() {
        return neck;
    }

    public String getInseam() {
        return inseam;
    }

    public String getHeight() {
        return height;
    }

    public String getDescription() {
        return description;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public String getSeason() {
        return season;
    }

    public String getGender() {
        return gender;
    }

    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    public String getIteration() {
        return iteration;
    }

    public String getStyleNumber() {
        return styleNumber;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getSKU() {
        return sKU;
    }

    //Setters

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public void setInseam(String inseam) {
        this.inseam = inseam;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setIteration(String iteration) {
        this.iteration = iteration;
    }

    public void setStyleNumber(String styleNumber) {
        this.styleNumber = styleNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSKU(String sKU) {
        this.sKU = sKU;
    }

    //autoPopulate (Takes in SKU or Style Number, populates variables with numbers)
    public void autoPopulate(String sKU) {

        //Get the season
        String seasonLetter = (Character.toString(sKU.charAt(0)));

        //Get the first number or gender
        String firstNum = (Character.toString(sKU.charAt(1)));

        //Get the second number or the style
        String secondNum = (Character.toString(sKU.charAt(2)));

        //Get the third number or the material
        String thirdNum = (Character.toString(sKU.charAt(3)));

        //Get the fourth number or the iteration
        String fourthNum = (Character.toString(sKU.charAt(4)) + Character.toString(sKU.charAt(5)) + Character.toString(sKU.charAt(6)));

        //Get the fifth number or the color in hex
        String fifthNum = (Character.toString(sKU.charAt(7)) + Character.toString(sKU.charAt(8)) + Character.toString(sKU.charAt(9)) +
                Character.toString(sKU.charAt(10)) + Character.toString(sKU.charAt(11)) + Character.toString(sKU.charAt(12)));

        //Get the sixth number or the size of the clothing
        String sixthNum = (Character.toString(sKU.charAt(13)) + Character.toString(sKU.charAt(14)));

        //Get the style number
        String styleNum = (seasonLetter + firstNum + secondNum + thirdNum + fourthNum);

        //Set the SKU
        setSKU(sKU);

        //Set the Style Number
        setStyleNumber(styleNum);

        //Set the season with the letter
        if(seasonLetter == "F"){
            setSeason("Fall");
        }
        else if(seasonLetter == "S"){
            setSeason("Spring");
        }
        else{
            setSeason("Unknown");
        }

        //Set the Gender from number
        if (firstNum == "1") {
            setGender("Male");
        } else if (firstNum == "2") {
            setGender("Female");
        } else if (firstNum == "3") {
            setGender("Unisex");
        } else {
            setGender("Unknown");
        }

        //Set the Style from number
        if (secondNum == "1") {
            setStyle("Pant");
        } else if (secondNum == "2") {
            setStyle("Short");
        } else if (secondNum == "3") {
            setStyle("Shirt");
        } else if (secondNum == "4") {
            setStyle("Dress");
        } else if (secondNum == "5") {
            setStyle("Sweater");
        } else if (secondNum == "6") {
            setStyle("Jacket");
        } else if (secondNum == "7") {
            setStyle("Skirt");
        } else if (secondNum == "8") {
            setStyle("Jumpsuit");
        } else if (secondNum == "9") {
            setStyle("Accessory");
        } else {
            setStyle("Unknown");
        }

        //Set the material from number
        if(thirdNum == "1"){
            setMaterial("Cotton Woven");
        }
        else if(thirdNum == "2") {
            setMaterial("Cotton Knit");
        }
        else if(thirdNum == "3") {
            setMaterial("Denim");
        }
        else if(thirdNum == "4") {
            setMaterial("Silk");
        }
        else if(thirdNum == "5") {
            setMaterial("Blend");
        }
        else if(thirdNum == "6") {
            setMaterial("Leather");
        }
        else if(thirdNum == "7") {
            setMaterial("Rayon");
        }
        else if(thirdNum == "8") {
            setMaterial("Polyester");
        }
        else if(thirdNum == "9") {
            setMaterial("Spandex");
        }
        else if(thirdNum == "0") {
            setMaterial("Synthetics");
        }
        else if(thirdNum == "A") {
            setMaterial("Wool");
        }
        else{
            setMaterial("Unknown");
        }

        //Set the iteration of the piece
        setIteration(fourthNum);

        //Set the color of the piece
        String colorName = calculateColor(fifthNum);
        setColor(colorName);

        setSize(sixthNum);

    }
    //Determine the color of the clothing by matching the closest RGB color
    public String calculateColor(String color){
        String red = (Character.toString(color.charAt(0)) + Character.toString(color.charAt(1)));
        String green = (Character.toString(color.charAt(2)) + Character.toString(color.charAt(3)));
        String blue = (Character.toString(color.charAt(4)) + Character.toString(color.charAt(5)));

        int r = Integer.parseInt(red);
        int g = Integer.parseInt(green);
        int b = Integer.parseInt(blue);

        String colorName = colorPicker.getColorNameFromRgb(r, g, b);

        return colorName;
    }

}
