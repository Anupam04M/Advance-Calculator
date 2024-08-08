package com.ritu.weather.rain.sun.advancecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ritu.weather.rain.sun.advancecalculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private TextView textView1,textView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView1=findViewById(R.id.tvmain);
        textView2=findViewById(R.id.tvsecs);

        String pi=String.valueOf(3.14159265358979323846);

        binding.aac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                textView2.setText("");
            }
        });
        binding.ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=textView1.getText().toString();
                s=s.substring(0,s.length()-1);
                textView1.setText(s);
            }
        });
        binding.ab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"(");
            }
        });
        binding.ab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+")");
            }
        });
        binding.asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"sin");
            }
        });
        binding.acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"cos");
            }
        });
        binding.atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 textView1.setText(textView1.getText()+"tan");
            }
        });
        binding.alan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"ln");
            }
        });
        binding.alog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"log");
            }
        });
        binding.afact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int val= Integer.parseInt(textView1.getText().toString());
                 int fact=factorial(val);
                 textView1.setText(String.valueOf(fact));
                 textView2.setText(val+"!");
            }
        });
        binding.asquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dd= Double.parseDouble(textView1.getText().toString());
                double squares = dd * dd;
                textView1.setText(String.valueOf(squares));
                textView2.setText(dd+"²");
            }
        });

        binding.asqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=textView1.getText().toString();
                double rss= Math.sqrt(Double.parseDouble(s));
                textView1.setText(String.valueOf(rss));
            }
        });
        binding.ainv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"^"+"-1");
            }
        });
        binding.adiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"÷");
            }
        });
        binding.a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"7");
            }
        });
        binding.a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"8");
            }
        });
        binding.a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"9");
            }
        });
        binding.amul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"×");
            }
        });
        binding.a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"4");
            }
        });
        binding.a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"5");
            }
        });
        binding.a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"6");
            }
        });
        binding.amin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"-");
            }
        });
        binding.a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"1");
            }
        });
        binding.a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"2");
            }
        });
        binding.a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"3");
            }
        });
        binding.aplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 textView1.setText(textView1.getText()+"+");;
            }
        });

        binding.api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(binding.api.getText());
                textView1.setText(textView1.getText()+pi);

            }
        });
        binding.a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 textView1.setText(textView1.getText()+"0");
            }
        });
        binding.adot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  textView1.setText(textView1.getText()+".");
            }
        });
        binding.aequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vals = textView1.getText().toString();
                String replace = vals.replace('÷', '/').replace('×', '*');
                double results = eval(replace);
                textView1.setText(String.valueOf(results));
                textView2.setText(vals);
            }
        });

    }


    int factorial(int n){
        if (n == 0 || n == 1){

            return 1;
        }
        else {

            return n * factorial(n - 1);
        }
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}