Feature:  Verify Get Call

  Scenario Outline: Get  call
    Given  Get all post "<URl>"
    Then  Response code sould be "<code>"

    Examples:
    |URl|code|
    |/posts|    |