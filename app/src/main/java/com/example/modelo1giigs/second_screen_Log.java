package com.example.modelo1giigs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

public class second_screen_Log extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen_log);
    }

    private void mostrarVentanaFlotante(View view) {
        View popupView = getLayoutInflater().inflate(R.layout.ventana_flotante, null);

        // Crear la ventana flotante y establecer el tamaño
        PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        // Establecer el fondo transparente para la ventana flotante
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // Mostrar la ventana flotante en el centro de la pantalla
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // Establecer el foco en la ventana flotante para cerrarla cuando el usuario toque fuera de ella
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.update();
    }

    //Paso a la pagina de recuperar contraseña
    private void recuperarPin (){
        TextView textView = findViewById(R.id.tvAvisoPin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(this, RecuperarPass.class);
                //startActivity(intent);
            }
        });
    }


}