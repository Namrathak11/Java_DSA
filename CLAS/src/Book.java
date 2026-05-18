public class Book {
    public static void main(String[] args) {
        Bob[] iam = new Bob[5];
        iam[0]=new Bob("RDR2", "morgan", 3600);
        iam[1]=new Bob("RDR2", "morgan", 3600);
        iam[2]=new Bob("RDR2", "morgan", 3600);
        iam[3]=new Bob("RDR2", "morgan", 3600);
        for(int i=0;i<iam.length;i++){
            if(iam[i]!=null) {
                iam[i].display();
                System.out.println();
            }
            else{
                break;
            }
        }
    }

       static class Bob {
            String name;
            String author;
            double price;

            Bob(String nam, String writer, double cost) {
                this.name = nam;
                this.author = writer;
                this.price = cost;
            }

            public void display() {
                System.out.print("Book name is: " + this.name + " Author name is: " + this.author + " price is: " + this.price);
            }
        }
    }
