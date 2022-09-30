@a101_alısveris

Feature: Alışveriş

  Background: Kullanıcı_A101_sayfasına_gider

  Scenario: TC01_A101_alışveriş
    Given  Kullanıcı A101 sayfasına gider
    When  Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer
    Then  Açılan ürünün siyah olduğunu doğrular
    When  Sepete ekle butonuna tıklar
    And  Sepeti Görüntüle butonuna tıklar
    And  Sepeti Onayla butonuna tıklar
    And  Üye olmadan devam et butonuna tıklanır
    And  Mail ekranı gelir ve mail adresini girerek alışverişine devam eder
    And  Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir
    And  Siparişi tamamla butonuna tıklar
    Then  ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.

