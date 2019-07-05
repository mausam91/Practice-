public class CalculatorFloorCarpet {
    private Floor floor;
    private  Carpet carpet;

      public CalculatorFloorCarpet(Floor floor,Carpet carpet){
          this.floor=floor;
          this.carpet=carpet;
      }

      public double getTotalCost(){

          return floor.getArea()*carpet.getCost();
      }
}
