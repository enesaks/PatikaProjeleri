var passaword = "123456"

if passaword == "123456"{
    print("Giriş Başarılı...")
}else{
    print("Giriş Başarısız")
}

enum PasswordOption{
    case zayıf
    case dogru
    case uyusmuyor
}

var passwordTwo : PasswordOption = .zayıf

switch passwordTwo{
case .zayıf:
    print("şifreniz çok güçsüz")
case .dogru:
    print("şifreniz guvenli")
case .uyusmuyor:
    print("şifreniz uyuşmuyor")
}
  
