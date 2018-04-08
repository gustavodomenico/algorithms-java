package booking;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

class HotelReview implements Exercise {
    private int[] sortHotels(String keywords, int[] hotelIds, String[] reviews) {
        Map<Integer, Integer> hotelReviews = new HashMap<>();

        String words = keywords.replaceAll("\\s+", "|");
        Pattern wordsRegex = Pattern.compile("(" + words + ")");

        for(int i = 0; i < reviews.length; i++) {
            int numberOfReferences = hotelReviews.getOrDefault(hotelIds[i], 0);

            Matcher m = wordsRegex.matcher(reviews[i]);
            while (m.find()) {
                numberOfReferences++;
            }

            hotelReviews.put(hotelIds[i], numberOfReferences);
        }

        Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(
                (k1, k2) -> {
                    Integer v1 = hotelReviews.get(k1);
                    Integer v2 = hotelReviews.get(k2);
                    if (v1.equals(v2)) {
                        return k1.compareTo(k2);
                    } else {
                        return v2.compareTo(v1);
                    }
                }
        ) {{
           putAll(hotelReviews);
        }};

        return sortedMap.keySet()
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }

    @Override
    public void solve() {
        Scanner scanner = new Scanner(in);

        String words = scanner.nextLine();

        int hotelCount = parseInt(scanner.nextLine());
        int[] hotels = new int[hotelCount];
        for (int i = 0; i < hotelCount; i++) {
            hotels[i] = parseInt(scanner.nextLine());
        }

        int reviewCount = parseInt(scanner.nextLine());
        String[] reviews = new String[reviewCount];
        for (int i = 0; i < reviewCount; i++) {
            reviews[i] = scanner.nextLine();
        }

        for (int hotel : sortHotels(words, hotels, reviews)) {
            out.println(hotel);
        }
    }
}
