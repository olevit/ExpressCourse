package com.example.expresscourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mResultEditText;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.buttonGetResult);
        mResultEditText = findViewById(R.id.editText);
        mInfoTextView = findViewById(R.id.textViewInfo);

    }

    public void onClick(View view) {
        //mInfoTextView.setText(String.valueOf((Integer.parseInt(String.valueOf(mResultEditText.getText()))) % 10));
        //mInfoTextView.setText(String.valueOf((Integer.parseInt(String.valueOf(mResultEditText.getText()))) / 10));
        //mInfoTextView.setText(String.valueOf((Integer.parseInt(String.valueOf(mResultEditText.getText()))) % 100 / 10));
        /*mInfoTextView.setText(String.valueOf(((Integer.parseInt(String.valueOf(mResultEditText.getText()))) % 10
                + (Integer.parseInt(String.valueOf(mResultEditText.getText()))) % 100 / 10
                + (Integer.parseInt(String.valueOf(mResultEditText.getText()))) % 1000 / 100)));*/
        /*int numberGet = Integer.parseInt(String.valueOf(mResultEditText.getText()));
        numberGet += 2 * ((numberGet + 1) % 2) + (numberGet % 2);
        mInfoTextView.setText(String.valueOf(numberGet));*/

        /*int numberGet = Integer.parseInt(String.valueOf(mResultEditText.getText()));
        if(numberGet % 10 > numberGet % 100 / 10 && numberGet % 100 / 10 > numberGet % 1000 / 100
                && numberGet % 1000 / 100 > numberGet % 10000 / 1000){
            mInfoTextView.setText(String.valueOf(true));
        }
        else{
        mInfoTextView.setText(String.valueOf(false));
        }*/
        /*Random random = new Random();
        int secret;
        secret = random.nextInt(100 + 1);
        int number = Integer.parseInt(String.valueOf(mResultEditText.getText()));
        int i = 0;

        while (i < 7) {
            if (number > secret) {
                mInfoTextView.setText(String.valueOf("Багато!"));
            }
            else if (number < secret) {
                mInfoTextView.setText(String.valueOf("Мало!"));
            } else {
                mInfoTextView.setText("Ви виграли!!!");
                break;
            }
            i++;
        }*/
        /*public int max(int first, int second, int third) {
            if(first > second && first > third){
                return first;
            }
            else if(second > first && second > third){
                return second;
            }
            else if(third > first && third > second){
                return third;
            }
            else {
                return -1;
            }
        }*/


        /*String text = String.valueOf(mResultEditText.getText());
        String phras = "";
        for(int i = 0; i < text.length(); i++){
            char s = text.charAt(i);
            if(s >= '0' && s <= '9') {
                i++;
            }
            else {
                phras += s;
            }
        }
        mInfoTextView.setText(phras);*/
        /*String text = String.valueOf(mResultEditText.getText());
        String phras = "";
        for(int i = 0; i < text.length(); i++){
            char s = text.charAt(i);
            if(s == 'A' || s == 'a' || s =='E'|| s == 'e' || s =='I'
                    || s =='i'|| s == 'O' || s == 'o' || s =='U'
                    || s == 'u') {
                i++;
            }
            else {
                phras += s;
            }
        }
        mInfoTextView.setText(phras);*/

        /*String text = String.valueOf(mResultEditText.getText());
        int [] count = new int[text.length()];
        for(int i = 0; i < text.length(); i++) {
            for(int j = 0; j < text.length(); j++){
                char si = text.charAt(i);
                char sj = text.charAt(j);
                if(si == sj){
                    count[i]++;
                }
            }
        }
        mInfoTextView.setText(Arrays.toString(count));*/

        /*String text = String.valueOf(mResultEditText.getText());
        String cat = "cat";
        int count= 0;
        for(int i = 0; i < (text.length() - cat.length() + 1); i++) {
            for(int j = 0; j < cat.length(); j++){
                char si = text.charAt(i + j);
                char sj = cat.charAt(j);
                if(si == sj){
                    count ++;
                }
            }
        }
        mInfoTextView.setText(String.valueOf(count / cat.length()));*/




// Цикл for
        /* int counter = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (i + 1); j++) {
                mInfoTextView.append(counter++ + " ");
            }
            mInfoTextView.append("\n");
        }*/


        //Масиви

        /*int[] numbers = {3, 9, 11, 15};
        int tmp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = tmp;
        mInfoTextView.setText(Arrays.toString(numbers));*/

        /*int[] numbers = new int[(30 - 2) / 2 + 1];
        int n = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = n+=2;
        }
        mInfoTextView.append(Arrays.toString(numbers));*/

        /*int[] numbers = new int[15];
        int n = 2;
        for(int i = 0; i < numbers.length; i++){
            if(n % 2 == 0)
                numbers[i] = n;
            else
                i--;
            n++;
        }
        mInfoTextView.append(Arrays.toString(numbers));*/

        /*int[] numbers = new int[(99 - 1) / 2 + 1];
        int n = -1;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = n+=2;
        }
        mInfoTextView.append(Arrays.toString(numbers));
        mInfoTextView.append(String.valueOf("\n["));
        for (int i = numbers.length - 1; i >= 0; i--){
            mInfoTextView.append(String.valueOf(numbers[i] + ","));
        }
        mInfoTextView.append(String.valueOf("]"));*/

        /*int[] fib = new int[20];
        for(int i = 2; i < fib.length; i++){
            fib[0] = 1;
            fib[1] = 1;
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        mInfoTextView.append(Arrays.toString(fib));*/
        /*int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        int max = mice[0];
        for(int i = 1; i < mice.length; i++){
            if(max < mice[i]){
                max = mice[i];
            }
        }
        int min = mice[0];
        for(int i = 1; i < mice.length; i++){
            if(min > mice[i]){
                min = mice[i];
            }
        }
        mInfoTextView.append(String.valueOf(max + " " + min));*/

        /*int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        Arrays.sort(mice);
        mInfoTextView.setText(String.valueOf(mice[mice.length-1] +"," + mice[mice.length-2] + "," + mice[mice.length-3]));*/

        /*int[] arr = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        int first = 0;
        int second = 0;
        int third = 0;
        for (int value : arr) {
            if (value > first) {
                third = second;
                second = first;
                first = value;
            } else if (value > second) {
                third = second;
                second = value;
            } else if (value > third) {
                third = value;
            }
        }
        mInfoTextView.setText(String.valueOf(first +"," + second + "," + third));*/


        /*int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        int tmp = 0, n = 1;
        for(int i = 0; i < (mice.length / 2); i++) {
            tmp = mice[i];
            mice[i] = mice[mice.length - n];
            mice[mice.length - n] = tmp;
            n++;
        }
        mInfoTextView.append(Arrays.toString(mice));*/

        /*int[] counter = new int[]{5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int tmp = 0;
        for(int i = 0; i < counter.length; i++){
            for(int j = counter.length - 2; j >= 0; j--) {
                if (counter[j] == 0) {
                    tmp = counter[j];
                    counter[j] = counter[j + 1];
                    counter[j + 1] = tmp;
                }
            }
        }
        mInfoTextView.append(Arrays.toString(counter));*/

        int[] counter = new int[]{5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int index = 0;
        for(int i = 0; i < counter.length; i++){
            if (counter[i] != 0){
                counter[index] = counter[i];
                index++;//this is arr empty
            }
        }
        while (index < counter.length){
            counter[index] = 0;
            index++;
        }
        mInfoTextView.append(Arrays.toString(counter));
        /*int[] counter = new int[]{5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int tmp = 0;
        for(int i = 0; i < counter.length; i++){
            for(int j = 1; j < counter.length; j++) {
                if (counter[j] == 0) {
                    tmp = counter[j];
                    counter[j] = counter[j - 1];
                    counter[j - 1] = tmp;
                }
            }
        }
        mInfoTextView.append(Arrays.toString(counter));*/

        /*int[] counter = new int[]{5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        int a = 25;
        for(int i = 0; i < counter.length; i++){
            if(counter[i] == a){
                mInfoTextView.setText(String.valueOf("25 має індекс: " + i));
            }
            else if (i== counter.length - 1){
                mInfoTextView.setText(String.valueOf(a + "is not found anywhere !"));
            }
        }*/
















        /*int counter = 10;
        while (counter > 0){
            mInfoTextView.append("Залишилось " + counter + " сек.\n");
            counter--;*/
        /*nt i = 10, j = 30;
        while (++i < --j);
        mInfoTextView.setText("Середнє значення дорівнює "  + i);
*/
        /*int counter = 10;
        do{
            mInfoTextView.append( "Залишилось" + counter + " сек.\n");
        }while (--counter > 0);*/
        /*int a = 10;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                a = i * j;
                mInfoTextView.append(a + " | ");
            }
            mInfoTextView.append("\n");
        }*/


    }
}
