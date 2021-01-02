
public class Main {
    public static void main(String[] args) {
        
    }
}
/*
Kaynak = Mustafa Murat Coskun Java Eğitimi

MultiTasking =

Birçok işin aynı anda yapılması MultiTasking kavramı olarak tanımlanabilir.Yemek yerken televizyon izlemek ve aynı anda telefonda konuşmak olarak ifade edebiliriz.

Bilgisayarlar için bu durumu düşünecek olursak Google Chrome içerisinde arama yaparken arkada Spotfiy ile şarkı çalınıyor olması ve sizin bir word dosyasını da alt tabta tutuyor olmanız bu duruma örnektir.

Eğer bilgisayarlarda Multitasking kavramı olmamış olsaydı biz aynı anda sadece bir işlemi gerçekleştirebilecektik

MultiTasking için Bilimsel tanımlama ise -->>

MultiTasking,birgisayarın birçok process'i(Islem) aynı anda çalıştırmasıdır.Örneğin hem Web Browserı çalıştırırken aynı zamanda Spotifyı çalıştırması gibi

MutiThreading ise bir Process içinde bir çok çalışma ünitesi oluşturup(thread) birçok işi bir arada yapmaktır.

Öğrneğin,Wordde yazı yazarken aynı anda Word içinde yazdıklarımızın kontrol edilmesi buna bir örnektir.

Farkları == 

MultiTasking birçok işlemi(uygulamayı) aynı anda çalıştırmak,

MultiThreading ise bir uygulama içerisinde birden fazla iş yapmak anlamına geliyor.

Process ve Thread ne anlama geliyor ? = 

*Process ,bilgisayarda çalışabilecek her türlü uygulamamızdır.Örneğin:Spotify,Windows Media Player,Google Chrome,

**Her process(bilgisayarda çalışabilecek her uygulama) bellekte kendi memory space'ine(bellek alanı) sahiptir.

***Biz Java uygulamasını çalıştırdığımız zaman bu uygulama JVM (Java Virtual Machine) üzerinde çalışacak bir process'e dönüşür.(Bilgisayarda çalışabilecek uygulama)

****Java Projeleri process'e dönüştüklerin zaman kendi memory space'ini veya diğer adıyla heap'ini oluşturur.

////Eğer elimizde 2 tane çalışır durumda uygulamamız(process) varsa bu uygulamalar birbirlerinin memory space'îne(bellek alanına) yada heaplerine erişemezler.

(Her uygulamanın kendine has bir hafıza noktası(bellek üzerinde kendisine tahsis edilmiş bir çalışma alanı oluşuyor ve bu alan içerisinde çalışıyor.) oluşuyor.)

Process ve Thread Kavramları ne anlama geliyor ? =

*Thread bir processin içinde bulunan bir çalışma ünitesidir ve her java programı en az bir thread'e sahiptir.

Eğer biz hiç thread oluşturmasak bile java projeleri main metodunu çalıştırırken bir tane main thread oluşturur.Bu main threadinin yanına kendimiz değişik işlemler yaptırmak için kendi threadimizi oluşturabiliriz.

*Threadler processlerin içinde oluştuğu için processlerin oluşturduğu bellek alanına direkt olarak erişim sağlayabilirler.

*Ayrıca bellek alanından ayrı olarak her threadin sadece kendinin erişebileceği bir tane thread stack'i bulunur.

MultiThreading' neden ihtiyaç duyuyoruz ? =

*Örnek olarak elimizde internetten bir dosya indirme gibi uzun zaman alacak bir iş var ve bu işlemden sonra yapacağımız daha bir çok iş bulunuyor.

Eğer biz bu işlemi multithreading kullanmayıp sadece uygulamayı main thread ile yazarsak,main thread(main metodu) bu işlem bitene kadar başka herhangi bir işlem gerçekleştiremeyecek.

Ancak eğer biz dosya indirme işlemini bir tane thread oluşturup yaparsak,main thread diğer işlerine zaman ayırabilir.Yani bizim uygulamamız bir çok işlemi paralel yapacak seviyeye gelmiş olur.

Bunun gibi biz daha bir çok işlemimizi threadler yardımıyla paralel yapabiliriz ve biz threadlerin paralel çalışmasına concurrency(eşzamanlılık) diyoruz.

Threadlerin Çalışması ==

Biz programlarımızda bir çok thread oluşturduğumuzda Java Virtual Machine ve İşletim Sistemi bu Threadlerin ne zaman çalışacağını ve ne zaman başlayacağını kendisi belirler.

Ayrıca Threadlerin çalışma sırası ve başlatılma sırası farklı olabileceği içib programlarımızda ortaya çıkan çıktılar farklılık gösterebilir.

**Buradaki threadlerin işlemlerine ne zaman başlayacağı JVM'e ve işletim Sistemine bağlıdır.

*/