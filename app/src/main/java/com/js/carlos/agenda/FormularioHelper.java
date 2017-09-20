package com.js.carlos.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.js.carlos.agenda.modelo.Aluno;

/**
 * Created by jose_carlos on 11/09/17.
 */

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText camoTelefone;
    private final EditText camoSite;
    private final RatingBar camoNota;
    private Aluno aluno = null;

    public FormularioHelper(FormularioActivity activity){
        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        camoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        camoSite = (EditText) activity.findViewById(R.id.formulario_site);
        camoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
        aluno = new Aluno();


    }


    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(camoTelefone.getText().toString());
        aluno.setSite(camoSite.getText().toString());
        aluno.setNota(Double.valueOf(camoNota.getProgress()));

        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        camoTelefone.setText(aluno.getTelefone());
        camoSite.setText(aluno.getSite());
        camoNota.setProgress(aluno.getNota().shortValue());
        this.aluno = aluno;
    }
}
