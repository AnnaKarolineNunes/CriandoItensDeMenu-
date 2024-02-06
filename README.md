# Como criar itens de menu em Apps Android

## Descrição

Este projeto visa a criação de itens de menu em apps Android. 

## Capturas de Tela

![image](https://github.com/AnnaKarolineNunes/CriandoItensDeMenu-/assets/101477642/bb4d639f-ea18-440c-b574-760b260e48dd)

## Passo a passo

- Passo 1 : Dentro do MainActivity.class, logo abaixo do método onCreate, deve-se criar o seguinte método:
  ```bash

      @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            return super.onCreateOptionsMenu(menu);
        }
  
- Passo 2 : Criar uma pasta denominada menu. Para isso, apartir da pasta res , com o botão direito do mouse,  clique em  new > Android Resource Directory e dê o nome de menu.
- Passo 3 :com o botão direito do mouse, clique em new > Menu resource File e dê o nome que deseja para o arquivo xml.
- Passo 4: Estilizar o XMl com os itens necessários conforme a necessidade. Exemplo: 
  ```bash

        <?xml version="1.0" encoding="utf-8"?>
      <menu xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto">
      
          <item
              android:id="@+id/ItemSalvar"
              android:title="Salvar"
              android:orderInCategory="100"
              app:showAsAction="always"
              android:icon="@drawable/ic_salvar_branco"
              />
      
          <item
              android:id="@+id/ItemEditar"
              android:title="Editar"
              android:orderInCategory="200"
              />
          <item
              android:id="@+id/ItemConfiguracoes"
              android:title="Configurações"
              android:orderInCategory="300"
              />
      
      </menu>
  
- Passo 5: No main Activity.class, colocar inserir o método getMenuInflater dentro do método onCreateOptionsMenu para inflar o XML criado.
  ```bash
  
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
  
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }
  
- Passo 6: criar o método onOptionsItemSelected no MainActivity.class. Lembrando que neste caso foi apenas exibida uma mensagem temporaria. Faça as adaptações necessárias. 
  ```bash

   @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch ( item.getItemId()){
            case R.id.ItemSalvar:
                Toast.makeText(MainActivity.this,
                        "Item Salvar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.ItemEditar:
                Toast.makeText(MainActivity.this,
                        "Item Editar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.ItemConfiguracoes:
                Toast.makeText(MainActivity.this,
                        "Item Configuraçoes",
                        Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
