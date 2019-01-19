package filetest.appmanager;

public class Locator {

  // Форма авторизации
  public static String username_text = "username"; // name
  public static String password_text = "password"; // name
  public static String LogIn_button = "//span/button"; // xpath

  // *******СТРОКА МЕНЮ*******
  public static String ksed = "(//a[contains(@title, 'КСЭД')])[1]"; //xpath  // КСЭД

  public static String barcode_search = "SEARCH_BARCODE_text"; //id  // Поиск по ШК
  public static String search_bc = "//input[contains(@id, 'search_bc')]"; //xpath  // Строка поиска по ШК

  public static String more_menu = "LOGIC_ECM_MORE_MENU_BAR"; //id // Меню "Ещё"
  public static String ksed_in_more_m = "SED_MENU_ITEM_ADDITIONAL_text";//id  // КСЭД в меню "Ещё"
  public static String Company_dir = "//a[contains(@title, 'Справочник организации')]"; //xpath  // Справочник организации
  public static String admin = "//a[contains(@title, 'Администрирование')]";//xpath  // Администрирование
  public static String transfer = "//a[contains(@title, 'Передача дел')]"; //xpath  // Передача дел
  public static String arm_arh = "//a[contains(@title, 'Передача дел')]"; //xpath  // АРМ Архивное дело
  public static String verify = "//a[contains(@title, 'Верификация')]"; //xpath  // Верификация
  public static String scanner = "//a[contains(@title, 'Верификация')]"; //xpath  // Работа со сканером ШК
  public static String notification = "NOTIFICATIONS_text"; //id  // Уведомления
  public static String notificationProtokol = "(//a[contains(text(), 'Протокол:')])[1]"; //xpath // Первое в списке уведомление о протоколе
  public static String notificationFirst = "(//span[@class = 'detail']/a)[1]"; //id  // Уведомление первое в списке
  // *******МЕНЮ ПОЛЬЗОВАТЕЛЯ*******
  public static String user_menu = "HEADER_USER_MENU_POPUP_text"; //id  // Меню пользователя
  public static String USER_LOGOUT = "HEADER_USER_MENU_LOGOUT_text"; //id // Выход из системы

  public static String my_profile = "//a[text() = 'Мой профиль']"; // xpath // Пункт меню "Мой профиль"
  public static String fieldlabel = "//div[@class = 'fieldlabel']"; //xpath // Должность в области краткой информации
  public static String btnEdit_profile = "//button[contains(@id, 'button-edit-button')]"; //xpath // Кнопка "Изменить профиль"
  public static String inputPosition = "//input[contains(@id, '-input-jobtitle')]"; //xpath // Поле ввода должности

  public static String logic_ESM = "//a[text() = 'Логика ECM. Мой профиль']";  // xpath // Пункт меню "Логика ECM. Мой профиль"
  public static String autoAnswerText = "prop_lecm-absence_auto-answer-text"; //name // Текст автоответа (Меня нет в офисе)
  public static String btnCancelAbsence = "//button[contains(@id, 'cancelButton-button')]"; //xpath // Кнопка "Отменить отсутствие"
  public static String btnYes = "//button[text() = 'Да']"; //xpath // Кнопка "Да" (отменить отсутствие)


  public static String edit_password = "//a[text() = 'Изменить пароль']"; //xpath // Пункт меню "Изменить пароль"
  public static String inputOldPassword = "//input[contains(@id, 'oldpassword')]"; //xpath // Введите старый пароль
  public static String inputNewPassword1 = "//input[contains(@id, 'newpassword1')]";  // xpath // Введите старый пароль
  public static String inputNewPassword2 = "//input[contains(@id, 'newpassword2')]"; // xpath // Введите старый пароль
  public static String btnOKchange = "//button[contains(@id, '_default-bu')][text() = 'ОК']"; //xpath // Кнопка "Изменить пароль"

  // *******ЛЕВАЯ ЧАСТЬ СТРАНИЦЫ (Кнопка "Создать" и разделы)*******
  public static String newDoc_button = "//button[contains(@id, 'newDocumentButton-button')]"; //xpath  // "Создать"

  public static String protocol = "//a[contains(@class, 'hassubmenu')][contains(text(), 'Протокол')]"; //xpath  // Протокол
  public static String rd = "//a[contains(@class, 'hassubmenu')][contains(text(), 'Распорядительный документ')]"; //xpath  // РД
  public static String reestr = "//a[contains(text(), 'Реестр')]"; //xpath  // Реестр
  public static String poruchenie = "//a[contains(@class, 'hassubmenu')][contains(text(), 'Поручение')]"; //xpath  // Поручение
  public static String resolution = "//a[contains(@class, 'hassubmenu')][contains(text(), 'Резолюция')]"; //xpath  // Резолюция
  public static String SZ = "//a[contains(@class, 'hassubmenu')][contains(text(), 'Служебная записка')]";//xpath  // Служебная записка
  public static String proizvDoc = "//a[contains(@class, 'yuimenuitemlabel')][contains(text(), 'Произвольный документ')]"; // xpath Произвольный документ
  public static String paket_vh = "//a[contains(@class, 'yuimenuitemlabel')][contains(text(), 'Пакет входящей корреспонденции')]"; //xpath //Пакет Вх. кор.
  public static String vhDoc = "//a[contains(@class, 'yuimenuitemlabel')][contains(text(), 'Входящий документ')]";
  public static String ishDoc = "//a[contains(@class, 'yuimenuitemlabel')][contains(text(), 'Исходящий документ')]";

  // РАЗДЕЛЫ
  public static String myWork = "//div[contains(text(), 'Моя работа')]"; //xpath  // Моя работа

  public static String expedition = "//div[contains(text(), 'Экспедиция')]"; //xpath  // Экспедиция

  public static String navigation = "//div[contains(text(), 'Навигатор')]"; //xpath  // Навигатор

  public static String allur = "//div[contains(text(), 'Отчеты')]"; //xpath  // Отчеты

  public static String workReg = "//div[contains(text(), 'Работа регистратора')]"; //xpath  // Работа регистратора

  public static String medo = "//div[contains(text(), 'МЭДО')]"; //xpath  // МЭДО

  public static String mySearch = "//div[contains(text(), 'Мои поисковые запросы')]"; //xpath  // Мои поисковые запросы
  public static String poiskzapr = "//span[text() = 'Поисковые запросы']";//xpath // Поисковые запросы
  public static String myPoiskZapr = "//td[contains(@id, 'ygtvcontente')]/span[text() = '2']";//xpath // Поисковые запросы
  public static String ControlZapr = "//span[text() = 'Управление поисковыми запросами']";//xpath // Управление поисковыми запросами


  // ОБЛАСТЬ ПРОСМОТРА (КСЭД)
  public static String oblProsm = "(//div[contains(@id, '_default-body')][contains(@class, 'datagrid')])[2]"; //xpath // Область просмотра
  public static String full_text_search = "(//input[contains(@id, '_default-full-text-search')])[1]"; //xpath // Поисковая строка
  public static String oneDocInList = "(//a[contains(@href, 'document?nodeRef=workspace')])[1]"; //xpath // Первый документ в списке
  public static String nineDocInList = "(//a[contains(@href, 'document?nodeRef=workspace')])[9]";  // xpath // Девятый документ в списке
  public static String subordinate = "//span[@class = 'expand-table-icon']"; //xpath // "+" раскрытие подчиненные документы
 
  public static String ActionTab = "//span[contains(@class, 'group-actions-counter')]"; //xpath // Кнопка "Действия с выбранными"
  public static String chBinOnl = "//input[contains(@id, '_default-select-all-records')]";//'//input[@name = "fileChecked"][3]'

  // Моя работа
  public static String WorkImmid = "//span[text() = 'Срочные']";//xpath //  раздел срочные
  public static String connectedDoc = "(//h2[contains(@id, 'alf-')])[6]"; //xpath //  связанные документы

  // ОТЧЕТЫ
/*  section_allur ='//div[contains(@id, "ac-head")][contains(text(), "Отчеты")]' //xpath  // Раздел "Отчеты"
  node_Logs ='//span[contains(text(), "Журналы")]'//xpath                               // "Журналы"

  node_Statis ='//span[contains(@class, "ygtvlabel")][contains(text(), "Статистические")]'//xpath  // "Статистические отчеты"
  edsBykindStat ='//a[contains(@onclick, "eds-by-kind-stat")]' //xpath // Отчет "Сводка по видам документов"

  node_ispDisp ='//div[contains(@class, "shown")]//span[contains(text(), "Отчеты по исполнительской дисциплине")]'//'//span[contains(text(), "Отчеты по исполнительской дисциплине")]' //xpath

  logs_incDoc ='//a[contains(text(), "Журнал регистрации входящих документов")]' //xpath
  incomingRegJournal ='//a[contains(@onclick, "incoming-reg-journal")]' //xpath // Отчет "Журнал регистрации входящих документов"
  logs_outDoc ='//a[contains(text(), "Журнал регистрации исходящих документов")]' //xpath
  outgoingRegistration ='//a[contains(@onclick, "outgoing-registration")]'  // xpath // Отчет "Журнал регистрации исходящих документов"
  logs_raspDoc ='//a[contains(text(), "Журнал регистрации Распорядительных документов")]' //xpath
  ordRegJournal ='//a[contains(@onclick, "ord-reg-journal")]'  // xpath // Отчет "Журнал регистрации Распорядительных документов"
  logs_sluDoc ='//a[contains(text(), "Журнал Регистрации служебных записок")]' //xpath
  internalRegJournal ='//a[contains(@onclick, "internal-reg-journal")]'  // xpath // Отчет "Журнал регистрации служебных записок"

  stat_specDoc ='//a[contains(text(), "Сводка по видам документов")]' //xpath
  edsBykindStat ='//a[contains(@onclick, "eds-by-kind-stat")]'  // xpath // Отчет "Сводка по видам документов"
  stat_temDoc ='//a[contains(text(), "Сводка по тематикам документов")]' //xpath
  edsBySubjectStat ='(//a[contains(@onclick, "eds-by-subject-stat")])[1]' //xpath // Отчет "Сводка по тематикам документов"
  stat_temDocO ='//a[contains(text(), "Сводка по тематикам документов (объедин.)")]' //xpath
  edsBySubjectStatO ='(//a[contains(@onclick, "eds-by-subject-stat")])[2]'  // xpath // Отчет "Сводка по тематикам документов(объед)"
  stat_tipDoc ='//a[contains(text(), "Сводка по типам документов")]' //xpath
  edByTypeStat ='//a[contains(@onclick, "eds-by-type-stat")]' //xpath // Отчет "Сводка по типам документов"

  allu_ispIncDoc ='//a[contains(text(), "Исполнение входящих документов")]' //xpath
  allu_raspDoc ='//a[contains(text(), "Исполнение распорядительного документа")]' //xpath
  allu_sluDoc ='//a[contains(text(), "Исполнение служебных записок")]' //xpath
  allu_ispDis ='//a[contains(text(), "Исполнительская дисциплина по авторам")]' //xpath
  allu_ispDispA ='//a[contains(text(), "Исполнительская дисциплина по исполнителям")]' //xpath
  allu_NispDI ='(//a[contains(text(), "Неисполненные поручения с истекшим сроком")])[1]' //xpath
  allu_NispDIrg ='//a[contains(text(), "Неисполнительные поручения с истекшим сроком РГ")]' //xpath
  allu_istS ='//a[contains(text(), "Поручения с истекающим сроком")]' //xpath
  allu_narS ='//a[contains(text(), "Поручения, исполненные с нарушением срока")]' //xpath
  allu_prodIsp ='//a[contains(text(), "Продуктивность по Исполнителям")]' //xpath
  allu_prodPodr ='//a[contains(text(), "Продуктивность по Подразделениям")]' //xpath
  allu_ReesContr ='//a[contains(text(), "Реестр для закрытия неактуальных контрольных поручений")]' //xpath
  allu_ReesContrN ='//a[contains(text(), "Реестр неисполнительных контрольных поручений")]' //xpath
  allu_ReesContrF ='//a[contains(text(), "Реестр фактически исполненных контрольных поручений")]' //xpath
  allu_SostIspR ='//a[contains(text(), "Состояние исполнения резолюций")]' //xpath
  */


  // *******РАБОТА С ДОКУМЕНТОМ*******

  // ОБЩИЕ АТРИБУТЫ
  //(форма создания документа)
  public static String title = "prop_lecm-document_title"; // name  // Заголовок

  public static String category_doc = "//input[contains(@id, '-category-assoc-cntrl-autocomplete-input')]";  // xpath  // Категория документа

  public static String doc_type = "//button[contains(@id, 'type-assoc-cntrl-tree-picker-button-button')]"; //xpath // Вид документа(кнопка выбора)
  public static String doc_typeInp = "//input[contains(@id, 'type-assoc-cntrl-autocomplete-input')]";     //xpath // Вид документа(поле ввода)
  public static String btnOKDT = "//button[contains(@id, 'type-assoc-cntrl-ok-button')]";              // xpath // Вид документа (кнопка "ОК")

  public static String podpisant = "//input[contains(@id, 'signerEmployeeAssoc-cntrl-autocomplete-input')]"; // xpath  // Подписант(ы)

  public static String sposob_dost = "//input[contains(@id, '_delivery-method-assoc-cntrl-autocomplete-input')]";  // xpath // Способ доставки

  public static String btnCreateDoc = "//button[contains(@id, '_default-form-submit-button')]"; // xpath  // Кнопка "Создать"

  public static String adresat = "//input[contains(@id, '_recipient-assoc-autocomplete')]";  // xpath // Адресат

  public static String korrespondent = "//input[contains(@id, 'sender-assoc-autocomplete')]";  // xpath // Корреспондент

  // (карточка документа)
  public static String attachments = "//span[contains(@id, 'action-expand')][contains(@class, 'attachments-expand')]"; //xpath // Переход во вкладку "Вложения"
  public static String vlozheniya = "//h2[contains(@id, 'heading')][contains(text(), 'Вложения')]"; // xpath // Вложения (раскрытие раздела)
  public static String osnSvedeniya = "//h2[contains(@id, 'heading')][contains(text(), 'Основные сведения')]";//xpath // Основные сведения (раскрытие раздела)
  public static String printForm = "//h2[contains(@id, 'heading')][contains(text(), 'Печатные формы')]"; //xpath // Печатные формы (раскрытие раздела)
  public static String printBarCode = "//a[contains(text(), 'Штрих-код документа')]"; //xpath //Печатная форма штрих кода документа
  public static String mode = "//button[contains(@id, 'default-cntrl-split-panel-button-button')]"; //xpath
  public static String fileUpload = "(//button[contains(@id, 'fileUpload-button-button')])[2]"; //xpath // Загрузить файл
  public static String fileUpload2 = "//button[contains(@id, 'fileUpload-button-button')]"; // xpath // Загрузить файл в поручении
  public static String files = "//input[@type='file'][@name='files[]']"; //xpath // Выберите файлы
  public static String show = "//a[contains(@id, 'action-show-main')]"; //xpath // Показать общую карточка
  public static String show_list = "//a[@class = 'preview-show-list']"; //xpath // Показать ввиде списка
  public static String btnPrint = "//button[contains(@id, 'print_from_preview')]"; //xpath // Кнопка печати в форме предварительного просмотра вложения
  public static String btnOKpodpis = "(//button[text() = 'ОК'])[1]"; //xpath // Кнопка ОК подтверждение подписания

  public static String soglasovanieWkladka = "//em[contains(text(), 'Согласование')]";  // xpath // Вкладка "Согласование"
  public static String createRuleBtn = "//button[contains(@id, 'create-approval-list-button-button')]";  // xpath // Кнопка "Создать маршрут"
  public static String createRuleIndivid = "//a[text() = 'Индивидуальный маршрут']"; //xpath // "Индивидуальный маршрут"
  public static String addEtap = "//button[contains(@id, 'cntrl-add-stage-button')]"; //xpath // Кнопка "Добавить этап"
  public static String tipeEtap = "//input[contains(@id, 'type-cntrl-autocomplete-input')]"; //xpath // "Вид этапа"
  public static String soglasuychie = "//input[contains(@id, 'approvers-autocomplete')]";//xpath // "Согласующие"
  public static String btnOKformSogl = "//button[contains(@id, 'form-submit-button')]"; //xpath // Кнопка "ОК" на форме добавления этапа согласования


  public static String punkti = "//em[contains(text(), 'Пункты')]"; //xpath // Вкладка "Пункты"
  public static String punktiBtn = "//button[contains(@id, 'create-point-button')]"; //xpath // Кнопка "Пункты"
  public static String punktPoruch = "(//a[contains(@class, 'yuimenuitemlabel')][contains(text(), 'Поручение')])[1]"; //xpath // Пункт/Поручение
  public static String textPoruch = "//textarea[contains(@id, 'ts_point-desc')]"; //xpath // Текст поручения
  public static String tipPoruch = "//input[contains(@id, 'type-assoc-cntrl-autocomplete-input')]"; // xpath // Тип поручения
  public static String otvetstv_ispolnVpunktah = "//input[contains(@id, '_executor-assoc-cntrl-autocomplete-input')]";  // xpath // Ответственный исполнитель в пунктах карточки документа
  public static String srokIspoln = "//input[contains(@id, 'ts_limitation-date-cntrl-date')]"; //xpath // Срок исполнения (среднее знач)

  public static String btnOKform = "//button[contains(@id, 'form-submit-button')]"; //xpath // Кнопка ОК на форме

  public static String addPunkt = "(//button[@title = 'Добавить пункт'])[1]"; //xpath // Кнопка "Добавить пункт"
  public static String textPunktaRD = "prop_lecm-ord-table-structure_item-content"; //name // Текст пункта РД
  public static String rassilka = "//em[text() = 'Рассылка']"; //xpath // Вкладка "Рассылка"
  public static String btnVipolnit = "(//button[contains(@id, 'create-mailing-list-button-button')])[1]";  // xpath // Кнопка "Создать маршрут"
  public static String punktBtnVipolnit = "//a[text() = 'Создать и заполнить указатель']"; //xpath // Создать и заполнить
  public static String otvetstv_ispolnVpunktahRD = "//input[contains(@id, 'executor-assoc-cntrl-autocomplete-input')]"; //xpath // Ответственный исполнитель в пункте РД
  //(Функциональное меню "Действия")
  //Согласовать
  public static String sendFor_approval = "//div[contains(text(), 'Направить на согласование')]"; //xpath // Действие "Направить на согласование"
  public static String sendFor_podpis = "//div[contains(text(), 'Направить на подписание')]"; // xpath // Действие "Направить на подписание"
  public static String sendFor_execution = "//div[contains(text(), 'Направить на исполнение')]"; // xpath // Действие "Направить на исполнение"
  public static String btnOKnaprNaIspoln = "//button[text() = 'ОК']"; //xpath // Кнопка "ОК" на форме подтверждения действия "Направить на исполнение"
  public static String confirm = "(//button[contains(@id, '-button')][text() = 'ОК'])[1]"; //xpath // Подтверждение согласования
  public static String confirm2 = "(//button[contains(@id, '-button')][text() = 'ОК'])"; // xpath // Подтверждение согласования
  public static String confirm_3 = "(//button[contains(@id, '-button')][text() = 'ОК'])[4]";  // xpath // Подтверждение согласования

  //"Отправить отчет"
  public static String actionSendAllere = "//div[text() = 'Отправить отчет']"; //xpath // "Отправить отчет" действие
  public static String btnSend = "//button[text() = 'Отправить']"; //xpath // Кнопка "Отправить"
  public static String textAllur = "//textarea[contains(@name, '_execute_1ReportText')]"; //xpath // Текстовое поле "Текст отчета"
  public static String btnAddSvyz = "//button[contains(@id, 'tree-picker-button-button')]"; //xpath // Кнопка добавления связи "..."
  public static String searchDoc = "//input[contains(@id, 'picker-searchText')]"; //xpath // Строка поиска в форме подбора
  public static String oneListEl = "(//span[@class = 'addIcon'])[1]";  // xpath // Первый элемент в списке справочника
  public static String btnOK = "//button[contains(@id, '-ok-button')]"; //xpath // Кнопка "ОК" в форме подбора


  public static String status_Doc = "//span[contains(@id, '_status')]"; //xpath // Статус документа во вкладке (Основные сведения)

  // (панель согласования)
  public static String APPROVED_button = "//button[contains(@id, 'APPROVED-button')]"; //xpath // Кнопка "Согласовать"
  public static String APPROVED_WITH_REMARK_button = "//button[contains(@id, 'APPROVED_WITH_REMARK-button')]"; //xpath // Кнопка "Согласовать с комментариями"
  public static String REJECTED_button = "//button[contains(@id, 'REJECTED-button')]"; //xpath // Кнопка "Отклонить"
  public static String internal_approval = "//button[contains(@id, 'internal_approval-button')]"; //xpath // Кнопка "Внутреннее согласование"
  public static String prop_bpm_comment = "prop_bpm_comment"; //name // Поле комментария
  public static String apply_button_button = "//button[contains(@id, 'apply-button')]"; //xpath // Кнопка "ОК" при вынесении решения согласования

  public static String SIGNED_button = "//button[contains(@id, 'SIGNED-button')]";//xpath // Кнопка "Подписать"


  // // ПРОТОКОЛ
  // //(форма создания документа)
  // addEl = '(//span[@class="addIcon"])[7]' //xpath  // Вид документа(Протокол совещания рабочей группы)
  // addEl2 = '(//span[@class="addIcon"])[6]' //xpath Вид документа "Служебная записка"

  // РАСПОРЯДИТЕЛЬНЫЙ ДОКУМЕНТ
  //(форма создания документа)
  public static String preambula = "//textarea[contains(@id, '-eds-document_summaryContent')]"; //xpath  // Преамбула
  public static String obcontrol = "//input[contains(@id, '-ord_controller-assoc-cntrl-autocomplete-input')]"; //xpath  // Общий контроль
  public static String wid_doc = "(//select[contains(@id, '_assoc_lecm-eds-document_document-type-assoc')])[1]"; //xpath  // Вид документа (в РД)
  public static String wid_doc_rasp = "//option[contains(text(), 'Распоряжение')]"; //xpath  // Вид документа РД (Распоряжение)

  // ПРОТОКОЛ
  //(форма создания документа)
  public static String addEl = "(//span[@class='addIcon'])[7]"; //xpath  // Вид документа(Протокол совещания рабочей группы)
  public static String addEl2 = "(//span[@class='addIcon'])[6]"; //xpath Вид документа "Служебная записка"
  public static String date = "//input[contains(@id, '_meeting-date-cntrl-date')]"; //xpath  // Дата совещания
  public static String category = "//input[contains(@id, '_category-assoc-cntrl-autocomplete-input')]";//xpath  // Категория
  public static String Chairman = "//input[contains(@id, 'chairman-assoc-cntrl-autocomplete-input')]";//xpath  // Председатель
  public static String Secretary = "//input[contains(@id, '_secretary-assoc-cntrl-autocomplete-input')]";//xpath  // Секретарь
  public static String person_present = "//input[contains(@id, '_attended-assoc-cntrl-autocomplete-input')]";//xpath  // Присутствовали
  //(карточка документа)


  //РЕЕСТР
  //(форма создания документа)
  /*vid_reestra ='//select[contains(@id, "_document-registry_type")]' //xpath  // Вид реестра
  vid_reestraPR ='//option[contains(text(), "Передачи на регистрацию")]' //xpath  // Вид реестра (Передачи на рег..)
  vid_reestraPP ='//option[contains(text(), "Приема/передачи")]' //xpath  // Вид реестра (Приема/передачи)
  btnCreateChern ='//button[contains(text(), "Создать черновик")]' //xpath  // Кнопка "Создать черновик"
  btnCreateSend ='//button[contains(text(), "Создать и отправить")]'  // Кнопка "Создать и отправить"
  inpDoc ='//input[contains(@id, "registry_doc-assoc-cntrl-autocomplete-input")]' //xpath  // Поле "Документы"
  poluchatel ='//input[contains(@id, "document-registry_receiver-assoc-autocomplete")]' //xpath  // Поле "Получатель"
*/
  // СЛУЖЕБНАЯ ЗАПИСКА
  //(форма создания документа)
/*  adresati ='//input[contains(@id, "internal_recipients-assoc-autocomplete")]'//xpath // Адресаты

  // ПРОИЗВОЛЬНЫЙ ДОКУМЕНТ
  //(форма создания документа)
  prorabotka ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[1]'//xpath // Проработка
  chBprorab ='(//input[contains(@class, "formsCheckBox")])[1]' //xpath // чекбокс проработка
  normokontrol ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[2]'//xpath // Нормоконтроль
  chBnorm ='(//input[contains(@class, "formsCheckBox")])[2]' //xpath // чекбокс Проработка
  soglasovanie ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[3]'//xpath // Согласование
  podpisanie ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[4]'//xpath // Подписание
  utverzhdenie ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[5]'//xpath // Утверждение
  oznakomlenie ='(//input[contains(@id, "_status-employee-assoc-cntrl-autocomplete-input")])[7]'//xpath // Ознакомление
*/
  // ПОРУЧЕНИЕ
  // (форма создания документа)
  public static String text_poruch = "prop_lecm-errands_content"; // name //Текст поручения
  public static String otvetstv_ispoln = "//input[contains(@id, 'executor-assoc-autocomplete')]";//xpath // Ответственный исполнитель

  // ПАКЕТ ВХОДЯЩЕЙ КОРРЕСПОНДЕНЦИИ

  // ВХОДЯЩИЙ ДОКУМЕНТ
  //(форма создания документа)
/*  ishNumber ='prop_lecm-incoming_outgoing-number' //name // Исходящий номер
  dateIS ='//input[contains(@id, "-incoming_outgoing-date-cntrl-date")]'  // xpath  // Дата исходящего

  // ИСХОДЯЩИЙ ДОКУМЕНТ
  //(форма создания документа)
  osnovPodpis ='prop_lecm-outgoing_signing-basis' //name // Основание подписания
  korrespondentISH ='//input[contains(@id, "contractor-assoc-autocomplete")]' //xpath // Корреспондент
  clickNull ='//div[contains(@id, "_default-form-container")]'  // КЛИК ВНЕ АТРИБУТОВ

  // Мои поисковые Запросы
  listChange ='//select[contains(@id, "default_searchQuery-selectType-entry")]' //Выпадающий список
  listChangeSZ ='//option[text() = "Служебная записка"]' //Выпадающий список - служебная записка
  listChangeRD ='//option[text() = "Распорядительный документ"]'  // Выпадающий список - РД
  butSave ='//div[contains(@class, "query-button-grey")][3]' //Кнопка сохранить
  nameZap ='//input[contains(@id, "createDetails_prop_lecm-search-queries_name")]' //Наименование запроса
  zaprosToDel ='//span[text() = "ToDel"]'//созданный запрос
  butDel ='//span[contains(@class, "yui-button yui-push-button")]//button[text() = "Удалить поисковый запрос"]' //Кнопка удалить
  butRed ='//span[contains(@class, "yui-button yui-push-button")]//button[text() = "Редактировать поисковый запрос"]' //Кнопка редактировать
  butDelAc ='//span[contains(@class, "first-child")]//button[text() = "Удалить"]' //Кнопка удалить подтверждение
  checkBoxFirst ='(//input[@name = "fileChecked"])[1]' //Первый чекбокс в списке
  butAct ='(//button[text() = "Действия с выбранными"])[2]' //Кнопка действия с выбором
  butAct_2 ='(//button[text() = "Действия с выбранными"])'  // Кнопка действия с выбором
  butExp ='(//button[text() = "Экспорт"])[2]' //Кнопка экспорта
  butExp_2 ='(//button[text() = "Экспорт"])'  // Кнопка экспорта
  butFavorite ='//a [text() = "Добавить в избранное"]' //Кнопка добавить в избранное
  butOK ='//button[text() = "Ок"]' //Кнопка OK добавить в избранное
  butSelExp ='(//a[text() = "Выгрузить выбранные"])' //Кнопка экспорта выбранного
*/
}
