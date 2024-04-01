package lessons.lesson_26.TvNew;

import java.util.ArrayList;

public class TvNewDemo {
    public static void main(String[] args) {
        ArrayList<TvNew> newTv = new ArrayList<>();

        System.out.println(newTv);
        System.out.println(newTv.size());

        newTv.add(new TvNew("Samsung", 50));
        newTv.add(new TvNew("Philips", 60));
        newTv.add(new TvNew("Funai", 30));

        System.out.println("Телевизоры ");
        System.out.println(newTv.size());


        String producerForDelete = "Samsung";
        TvNew tvNewForRemove = findFirstTvNewByProducer(newTv, producerForDelete);

        if (tvNewForRemove != null) {
            newTv.remove(tvNewForRemove);
            System.out.println("Наша коллекция после распродажи:");
            printTvNewList(newTv);
        } else {
            System.out.println("Такого производителя не найдено!");
        }
    }

        private static void printTvNewList (ArrayList < TvNew > tvNewList) {
            for (int i = 0; i < tvNewList.size(); i++) {
                System.out.println(tvNewList.get(i));
            }
        }

        private static TvNew findFirstTvNewByProducer (ArrayList < TvNew > tvNewList, String producer){
            for (int i = 0; i < tvNewList.size(); i++) {
                TvNew currentTvFromCollection = tvNewList.get(i);
                if (currentTvFromCollection.getProduced().equals(producer)) {
                    return currentTvFromCollection;
                }
            }
            return null;


        }
    }



