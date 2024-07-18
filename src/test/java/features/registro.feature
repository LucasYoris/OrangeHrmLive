Feature: Registro de usuarios

  Scenario: Registrar un nuevo usuario en la opción Admin
    Given el usuario realiza el login con usuario "Admin" y password "admin123"
    And el usuario agrega un nuevo usuario
    And el usuario carga los datos del nuevo usuario "Admin" "Peter Mac Anderson" "Enabled" "adminTest" "admin123"
    Then Se debe verificar el mensaje de succesfully saved

