package projeto_bytebank.bytebank_herdado;

//contrato Autenticavel
    //quem assina(implements) esse contrato, precisa implementar:
        //metodo senha
        //metodo autentica
public abstract interface Autenticavel {


    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);

}