package apps.proyecto.pairumani.appbuild;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LadrilloDialog extends DialogFragment implements View.OnClickListener
{
        Button cerrar;
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladrillo_dialog);
    }
    */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
     //   return super.onCreateView(inflater, container, savedInstanceState);
        View view =inflater.inflate(R.layout.activity_ladrillo_dialog, null);
        cerrar = (Button) view.findViewById(R.id.btncerrar);
        setCancelable(false);
        cerrar.setOnClickListener(this);
        return view;

    }




    @Override
    public void onClick(View view) {
         dismiss();
    }
}
