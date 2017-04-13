/**
 * Created by Chase on 2/26/2017.
 */


public class Inventory {

    private String waist;
    private String chest;
    private String neck;
    private String inseam;
    private String height;
    private String brandLabel;
    private String color;
    private String gender;
    private String description;
    private String itemNumber;
    private String styleNumber;
    private String iteration;
    private String size;
    private String season;
    private String style;
    private Clothing clothing;
    private String sku;
    private String filter;
    private SQLTalk connection;
    private Clothing[] clothes;


    public static void main(String[] args) {

    }

    public Inventory(String waist, String cheat, String neck, String inseam, String height, String brandLabel, String color, String gender, String description, String itemNumber, String styleNumber, String iteration, String size, String season, String style, Clothing clothing, String sku) {
        this.waist = waist;
        this.chest = cheat;
        this.neck = neck;
        this.inseam = inseam;
        this.height = height;
        this.brandLabel = brandLabel;
        this.color = color;
        this.gender = gender;
        this.description = description;
        this.itemNumber = itemNumber;
        this.styleNumber = styleNumber;
        this.iteration = iteration;
        this.size = size;
        this.season = season;
        this.style = style;
        this.clothing = clothing;
        this.sku = sku;
    }

    public Inventory(String sku, String brandLabel, String color, String gender, String description, String itemNumber, String styleNumber, String iteration, String size, String season, String style, Clothing clothing) {
        this.sku = sku;
        this.brandLabel = brandLabel;
        this.color = color;
        this.gender = gender;
        this.description = description;
        this.itemNumber = itemNumber;
        this.styleNumber = styleNumber;
        this.iteration = iteration;
        this.size = size;
        this.season = season;
        this.style = style;
        this.clothing = clothing;
    }

    public Inventory(String style, String brandLabel, String color, String gender, String description, String itemNumber, String styleNumber, String iteration, String size, String season) {
        this.style = style;
        this.brandLabel = brandLabel;
        this.color = color;
        this.gender = gender;
        this.description = description;
        this.itemNumber = itemNumber;
        this.styleNumber = styleNumber;
        this.iteration = iteration;
        this.size = size;
        this.season = season;
    }

    public String getWaist() {
        return waist;
    }

    public String getNeck() {
        return neck;
    }

    public String getInseam() {
        return inseam;
    }

    public String getChest() {
        return chest;
    }

    public String getHeight() {
        return height;
    }

    public String getBrandLabel() {
        return brandLabel;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getStyleNumber() {
        return styleNumber;
    }

    public String getIteration() {
        return iteration;
    }

    public String getSize() {
        return size;
    }

    public String getSeason() {
        return season;
    }

    public String getStyle() {
        return style;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public Clothing[] getClothes() {
        return clothes;
    }

    public String getSku() {
        return sku;
    }

    public void setClothes(Clothing[] clothes) {
        this.clothes = clothes;
    }

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

    public void setBrandLabel(String brandLabel) {
        this.brandLabel = brandLabel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setStyleNumber(String styleNumber) {
        this.styleNumber = styleNumber;
    }

    public void setIteration(String iteration) {
        this.iteration = iteration;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Clothing changeHeight(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setHeight(newData);
        return returnClothing;
    }

    public Clothing changePrice(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setCurrentPrice(newData);
        return returnClothing;
    }

    public Clothing changeNeck(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setNeck(newData);
        return returnClothing;
    }

    public Clothing changeColor(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setColor(newData);
        return returnClothing;
    }


    public Clothing changeGender(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setGender(newData);
        return returnClothing;
    }

    public Clothing changeDescription(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setDescription(newData);
        return returnClothing;
    }

    public Clothing changeStyleNumber(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setStyleNumber(newData);
        return returnClothing;
    }

    public Clothing changeIteration(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setIteration(newData);
        return returnClothing;
    }

    public Clothing changeSize(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setSize(newData);
        return returnClothing;
    }

    public Clothing changeSeason(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setSeason(newData);
        return returnClothing;
    }

    public Clothing changeStyle(Clothing selectedPiece, String newData){
        Clothing returnClothing = new Clothing();
        returnClothing = selectedPiece;
        returnClothing.setStyle(newData);
        return returnClothing;
    }

    public Clothing addClothes(String SKU){
        Clothing newPiece = new Clothing();
        newPiece.autoPopulate(SKU);
        return newPiece;
    }

    public void removeClothes(String SKU){



        for(int i = 0; i > clothes.length; i++){
            if(clothes[i] != null && clothes[i].getSKU() == SKU){
                clothes[i] = null;
            }
        }
        connection.removeClothes(SKU);
    }

    public void search(String input, String filter){

        if(input == itemNumber){
            searchItemNumber(input);
        }
        else if(input == styleNumber){
            searchStyleNumber(input);
        }
        else if(input == sku){
            searchSKU(input);
        }
        else if(input == style){
            searchStyle(input);
        }
        else if(input == description){
            searchDescription(input);
        }
        else{
            searchAll(input);
        }
    }

    public Clothing[] searchItemNumber(String itemNumber){
        clothes = connection.searchItemNumber(itemNumber);
        return clothes;
    }

    public Clothing[] searchStyleNumber(String styleNumber){
        clothes = connection.searchStyleNumber(styleNumber);
        return clothes;
    }

    public Clothing[] searchSKU(String SKU){
        clothes = connection.searchSKU(SKU);
        return clothes;
    }

    public Clothing[] searchStyle(String style){
        clothes = connection.searchStyle(style);
        return clothes;
    }

    public Clothing[] searchDescription(String description){
        clothes = connection.searchDescription(description);
        return clothes;
    }

    public Clothing[] searchAll(String input){
        clothes = connection.searchAll(input);
        return clothes;
    }




}
