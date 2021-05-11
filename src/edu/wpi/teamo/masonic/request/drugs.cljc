(ns edu.wpi.teamo.masonic.request.drugs
  (:refer-clojure :exclude [list]))

(def list
  ["Abilify"
   "Abilify Maintena"
   "Acetaminophen"
   "Actos"
   "Acyclovir"
   "Adderall"
   "Adderall XR"
   "Advair"
   "Advair Diskus"
   "Advil"
   "Afinitor"
   "Aimovig"
   "Ajovy"
   "Albuterol"
   "Aldactone"
   "Alecensa"
   "Alendronate"
   "Aleve"
   "Allegra"
   "Allopurinol"
   "Alprazolam"
   "Alunbrig"
   "Amantadine"
   "Ambien"
   "Amiodarone"
   "Amitriptyline"
   "Amlodipine"
   "Amoxicillin"
   "Amoxicillin and Clavulanate"
   "Ampicillin"
   "Anastrozole"
   "AndroGel"
   "Annovera"
   "Apixaban"
   "Apokyn"
   "Aricept"
   "Arimidex"
   "Aripiprazole"
   "Aristada"
   "Aromasin"
   "Ascorbic acid"
   "Aspirin"
   "Atarax"
   "Atenolol"
   "Ativan"
   "Atomoxetine"
   "Atorvastatin"
   "Atropine"
   "Aubagio"
   "Augmentin"
   "Austedo"
   "Azathioprine"
   "Azelastine"
   "Azilect"
   "Azithromycin"
   "Bacitracin"
   "Baclofen"
   "Bactrim"
   "Bactrim DS"
   "Bactroban"
   "Banzel"
   "Baqsimi"
   "Basaglar"
   "Bavencio"
   "Belbuca"
   "Belsomra"
   "Benadryl"
   "Benazepril"
   "Bendeka"
   "Benicar"
   "Bentyl"
   "Benzonatate"
   "Benztropine"
   "Berinert"
   "Betamethasone"
   "Bethanechol"
   "Biaxin"
   "Bicalutamide"
   "Biktarvy"
   "Biotin"
   "Bisacodyl"
   "Bisoprolol"
   "Bisoprolol and hydrochlorothiazide"
   "Blincyto"
   "Boniva"
   "Botox"
   "Breo Ellipta"
   "Breztri Aerosphere"
   "Brilinta"
   "Brimonidine"
   "Bromocriptine"
   "Brukinsa"
   "Bryhali"
   "Budesonide"
   "Budesonide and Formoterol"
   "Bumetanide"
   "Bumex"
   "Buprenex"
   "Buprenorphine"
   "Buprenorphine & Naloxone"
   "Buprenorphine and Naloxone"
   "Bupropion"
   "Buspar"
   "Buspirone"
   "Bydureon"
   "Bystolic"
   "Cabometyx"
   "Calcium carbonate"
   "Calquence"
   "Caplyta"
   "Captopril"
   "Carbamazepine"
   "Carbidopa and levodopa"
   "Cardizem"
   "Carvedilol"
   "Cefdinir"
   "Cefixime"
   "Ceftriaxone"
   "Cefuroxime"
   "Celebrex"
   "Celecoxib"
   "Celexa"
   "Cephalexin"
   "Cequa"
   "Cetirizine"
   "Chlorthalidone"
   "Cholecalciferol"
   "Cialis"
   "Cimzia"
   "Cinryze"
   "Cipro"
   "Ciprofloxacin"
   "Citalopram"
   "Clarithromycin"
   "Claritin"
   "Clindamycin"
   "Clobetasol"
   "Clobex"
   "Clodan"
   "Clonazepam"
   "Clonidine"
   "Clopidogrel"
   "Clotrimazole"
   "Clozapine"
   "Codeine"
   "Colace"
   "Colchicine"
   "Concerta"
   "Coreg"
   "Cosentyx"
   "Coumadin"
   "Cozaar"
   "Crestor"
   "Cyanocobalamin"
   "Cyclobenzaprine"
   "Cymbalta"
   "Decadron"
   "Demerol"
   "Depakote"
   "Depo-Provera"
   "Descovy"
   "Desloratadine"
   "Desmopressin"
   "Desvenlafaxine"
   "Desyrel"
   "Dexamethasone"
   "Dexamethasone Intensol"
   "Dexilant"
   "Dextroamphetamine"
   "Dextromethorphan"
   "Dextrose"
   "Diacomit"
   "Diastat"
   "Diazepam"
   "Diclofenac"
   "Dicyclomine"
   "Diflucan"
   "Digoxin"
   "Dilantin"
   "Dilaudid"
   "Diltiazem"
   "Diovan"
   "Diphenhydramine"
   "Diprolene"
   "Ditropan"
   "Divalproex"
   "Divalproex sodium"
   "Docusate"
   "Docusate Sodium"
   "Donepezil"
   "Dopamine"
   "Doxazosin"
   "Doxepin"
   "Doxycycline"
   "Dulcolax"
   "Dulera"
   "Duloxetine"
   "DuoNeb"
   "Duopa"
   "Dupixent"
   "Dutasteride"
   "Ecotrin"
   "Effexor"
   "Effexor XR"
   "Effient"
   "Elagolix"
   "Elavil"
   "Elidel"
   "Eligard"
   "Eliquis"
   "Elmiron"
   "Emgality"
   "Empagliflozin"
   "Enalapril"
   "Enbrel"
   "Enoxaparin"
   "Entecavir"
   "Entresto"
   "Entyvio"
   "Epclusa"
   "Ephedrine"
   "EpiPen"
   "Epidiolex"
   "Eplerenone"
   "Epoetin alfa"
   "Epogen"
   "Ergocalciferol"
   "Erleada"
   "Ertapenem"
   "Erythromycin"
   "Escitalopram"
   "Esomeprazole"
   "Estrace"
   "Estradiol"
   "Eszopiclone"
   "Etanercept"
   "Etodolac"
   "Euthyrox"
   "Everolimus"
   "Evista"
   "Excedrin"
   "Exelon"
   "Exemestane"
   "Ezetimibe"
   "Famciclovir"
   "Famotidine"
   "Farxiga"
   "Fasenra"
   "Faslodex"
   "Febuxostat"
   "Felodipine"
   "Femara"
   "Fenofibrate"
   "Fentanyl"
   "Ferrous Sulfate"
   "Ferrous fumarate"
   "Ferrous gluconate"
   "Fexofenadine"
   "Finasteride"
   "Fintepla"
   "Fioricet"
   "Firazyr"
   "Firmagon"
   "Fish Oil"
   "Flagyl"
   "Flecainide"
   "Flexeril"
   "Flomax"
   "Flonase"
   "Florastor"
   "Flovent"
   "Flovent HFA"
   "Fluconazole"
   "Fludrocortisone"
   "Fluocinonide"
   "Fluoxetine"
   "Fluphenazine"
   "Fluticasone"
   "Fluticasone and salmeterol"
   "Fluticasone nasal"
   "Fluvoxamine"
   "Focalin"
   "Folic Acid"
   "Formoterol"
   "Forteo"
   "Fosamax"
   "Fosfomycin"
   "Fulvestrant"
   "Furosemide"
   "Gabapentin"
   "Galantamine"
   "Ganciclovir"
   "Garlic"
   "Gas-X"
   "Gaviscon"
   "Gavreto"
   "Gazyva"
   "Gemcitabine"
   "Gemfibrozil"
   "Gemzar"
   "Genotropin"
   "Gentamicin"
   "Genvoya"
   "Geodon"
   "Gilenya"
   "Ginger"
   "Ginkgo"
   "Ginkgo Biloba"
   "Ginseng"
   "Glatiramer"
   "Gleevec"
   "Glimepiride"
   "Glipizide"
   "Glipizide and metformin"
   "Glucagon"
   "Glucophage"
   "Glucosamine"
   "Glucosamine & Chondroitin with MSM"
   "Glucotrol"
   "Glucovance"
   "Glutathione"
   "Glyburide"
   "Glycerin"
   "GlycoLax"
   "Glycopyrrolate"
   "Glyxambi"
   "GoLYTELY"
   "Gocovri"
   "Gralise"
   "Griseofulvin"
   "Guaifenesin"
   "Guanfacine"
   "Gvoke HypoPen"
   "Haegarda"
   "Halcion"
   "Haldol"
   "Haldol Decanoate"
   "Halobetasol"
   "Halobetasol Topical"
   "Haloperidol"
   "Harvoni"
   "Hawthorn"
   "Hcg"
   "Heparin"
   "Hepatitis B adult vaccine"
   "Herceptin"
   "Hibiclens"
   "Hizentra"
   "Horizant"
   "Humalog"
   "Humira"
   "Humulin N"
   "Humulin R"
   "Humulin RU 500"
   "Hydralazine"
   "Hydrea"
   "Hydrochlorothiazide"
   "Hydrochlorothiazide and irbesartan"
   "Hydrochlorothiazide and lisinopril"
   "Hydrochlorothiazide and losartan"
   "Hydrochlorothiazide and olmesartan"
   "Hydrochlorothiazide and triamterene"
   "Hydrochlorothiazide and valsartan"
   "Hydrocodone"
   "Hydrocodone and acetaminophen"
   "Hydrocortisone"
   "Hydrocortisone topical"
   "Hydromorphone"
   "Hydroxychloroquine"
   "Hydroxyurea"
   "Hydroxyzine"
   "Hydroxyzine Pamoate"
   "Hyoscyamine"
   "Hysingla ER"
   "Hytrin"
   "Hyzaar"
   "Ibandronate"
   "Ibrance"
   "Ibrutinib"
   "Ibu"
   "Ibuprofen"
   "Iclusig"
   "Idhifa"
   "Ilumya"
   "Imatinib"
   "Imbruvica"
   "Imdur"
   "Imfinzi"
   "Imipramine"
   "Imiquimod"
   "Imitrex"
   "Imodium"
   "Imodium A-D"
   "Impoyz"
   "Imuran"
   "Incruse Ellipta"
   "Indapamide"
   "Inderal"
   "Indocin"
   "Indomethacin"
   "Infliximab"
   "Ingrezza"
   "Injectafer"
   "Inlyta"
   "Insulin"
   "Insulin Aspart"
   "Insulin Detemir"
   "Insulin Lispro"
   "Insulin aspart"
   "Insulin glargine"
   "Insulin regular"
   "Intuniv"
   "Invega"
   "Invega Sustenna"
   "Invokana"
   "Ipratropium"
   "Irbesartan"
   "Isoniazid"
   "Isosorbide"
   "Isosorbide dinitrate"
   "Isosorbide mononitrate"
   "Isotretinoin"
   "Itraconazole"
   "Ivabradine"
   "Ivermectin"
   "Jadenu"
   "Jaimiess"
   "Jakafi"
   "Jalyn"
   "Jantoven"
   "Janumet"
   "Janumet XR"
   "Januvia"
   "Jardiance"
   "Jasmiel"
   "Jatenzo"
   "Jelmyto"
   "Jencycla"
   "Jentadueto"
   "Jentadueto XR"
   "Jevtana"
   "Jiaogulan"
   "Jinteli"
   "Jivi"
   "Jojoba"
   "Jolessa"
   "Jolivette"
   "Jornay PM"
   "Jublia"
   "Juluca"
   "Junel"
   "Junel 1.5/30"
   "Junel 1/20"
   "Junel Fe 24"
   "Juniper"
   "Juvederm"
   "Juxtapid"
   "Jynarque"
   "K-Dur"
   "K-Tab"
   "Kadcyla"
   "Kadian"
   "Kaletra"
   "Kanamycin"
   "Kaopectate"
   "Kariva"
   "Kava"
   "Kayexalate"
   "Keflex"
   "Kenalog"
   "Kenalog-40"
   "Keppra"
   "Keppra XR"
   "Kesimpta"
   "Ketalar"
   "Ketamine"
   "Ketoconazole"
   "Ketoconazole topical"
   "Ketoprofen"
   "Ketorolac"
   "Ketorolac Tromethamine"
   "Ketorolac ophthalmic"
   "Ketotifen"
   "Ketotifen ophthalmic"
   "Kevzara"
   "Keytruda"
   "Kineret"
   "Kisqali"
   "Klonopin"
   "Klor-Con"
   "Kombiglyze XR"
   "Kratom"
   "Krill Oil"
   "Kurvelo"
   "Kyleena"
   "Kynmobi"
   "Kyprolis"
   "Kytril"
   "kalbitor"
   "Labetalol"
   "Lactulose"
   "Lamictal"
   "Lamotrigine"
   "Lansoprazole"
   "Lantus"
   "Lasix"
   "Latanoprost"
   "Latuda"
   "Leflunomide"
   "Lenvatinib"
   "Lenvima"
   "Letrozole"
   "Leukeran"
   "Levalbuterol"
   "Levaquin"
   "Levemir"
   "Levetiracetam"
   "Levocetirizine"
   "Levodopa"
   "Levofloxacin"
   "Levonorgestrel"
   "Levothyroxine"
   "Lexapro"
   "Lexette"
   "Lidex"
   "Lidocaine"
   "Liletta"
   "Linezolid"
   "Linzess"
   "Lipitor"
   "Liraglutide"
   "Lisinopril"
   "Lithium"
   "Loestrin 24 Fe "
   "Lokelma"
   "Lomotil"
   "Loperamide"
   "Lopressor"
   "Loratadine"
   "Lorazepam"
   "Lorlatinib"
   "Lortab"
   "Losartan"
   "Lovastatin"
   "Lovenox"
   "Lunesta"
   "Lupron"
   "Lupron Depot"
   "Luxiq"
   "Lyrica"
   "Lyumjev"
   "Macrobid"
   "Magnesium"
   "Magnesium citrate"
   "Magnesium oxide"
   "Mavenclad"
   "Mavyret"
   "Mayzent"
   "Meclizine"
   "Medrol"
   "Medrol Dosepak"
   "Melatonin"
   "Meloxicam"
   "Memantine"
   "Meropenem"
   "Mesalamine"
   "Metamucil"
   "Metformin"
   "Methadone"
   "Methimazole"
   "Methocarbamol"
   "Methotrexate"
   "Methylphenidate"
   "Methylprednisolone"
   "Metoclopramide"
   "Metolazone"
   "Metoprolol"
   "Metronidazole"
   "Midazolam"
   "Midodrine"
   "Minocycline"
   "MiraLAX"
   "Mirtazapine"
   "Mobic"
   "Modafinil"
   "Mometasone"
   "Montelukast"
   "Morphine"
   "Motrin"
   "Mucinex"
   "Mupirocin"
   "Mupirocin topical"
   "Mycapssa"
   "Mycophenolate mofetil"
   "Mylotarg"
   "Myrbetriq"
   "NAC"
   "NPlate"
   "Nabumetone"
   "Nadolol"
   "Naloxone"
   "Naltrexone"
   "Namenda"
   "Naprosyn"
   "Naproxen"
   "Naratriptan"
   "Narcan"
   "Nasonex"
   "Nayzilam"
   "Nebivolol"
   "Neomycin"
   "Neosporin"
   "Neostigmine"
   "Nerlynx"
   "Neulasta"
   "Neupro"
   "Neurontin"
   "Nexium"
   "Nexletol"
   "Nexlizet"
   "Nexplanon"
   "Niacin"
   "Niaspan"
   "Nicotine"
   "Nifedipine"
   "Nitrofurantoin"
   "Nitroglycerin"
   "Nitrostat"
   "Nivolumab"
   "Nizoral"
   "Norco"
   "Norepinephrine"
   "Norethindrone"
   "Norflex"
   "Nortriptyline"
   "Norvasc"
   "NovoLog"
   "Nubeqa"
   "Nucynta"
   "Nurtec ODT"
   "NuvaRing"
   "Nuvigil"
   "Nystatin"
   "Ocrelizumab"
   "Ocrevus"
   "Octreotide"
   "Ofev"
   "Ofloxacin"
   "Olanzapine"
   "Olaparib"
   "Olmesartan"
   "Olopatadine"
   "Olopatadine ophthalmic"
   "Olux"
   "Omalizumab"
   "Omega-3 polyunsaturated fatty acids"
   "Omeprazole"
   "Omnicef"
   "Ondansetron"
   "Ongentys"
   "Onglyza"
   "Onpattro"
   "Onureg"
   "Opana"
   "Opdivo"
   "Opium"
   "Orencia"
   "Orgovyx"
   "Oriahnn"
   "Orilissa"
   "Orlistat"
   "Orphenadrine"
   "Ortho Tri-Cyclen"
   "Oseltamivir"
   "Osimertinib"
   "Otezla"
   "Oxaliplatin"
   "Oxazepam"
   "Oxcarbazepine"
   "Oxybutynin"
   "Oxycodone"
   "Oxycontin"
   "Oxygen"
   "Oxymetazoline"
   "Oxymetazoline nasal"
   "Oxymorphone"
   "Oxytocin"
   "Ozanimod"
   "Ozempic"
   "Pantoprazole"
   "Paracetamol"
   "Paragard"
   "Paroxetine"
   "Paxil"
   "Penicillin"
   "Pepcid"
   "Percocet"
   "Phenazopyridine"
   "Phenergan"
   "Phenobarbital"
   "Phentermine"
   "Phenytoin"
   "Phexxi"
   "Pioglitazone"
   "Plaquenil"
   "Plavix"
   "Polyethylene glycol 3350"
   "Potassium Chloride"
   "Pradaxa"
   "Praluent"
   "Pramipexole"
   "Pravastatin"
   "Prazosin"
   "Prednisolone"
   "Prednisone"
   "Pregabalin"
   "Premarin"
   "Prevacid"
   "Prilosec"
   "Primidone"
   "Pristiq"
   "ProAir HFA"
   "Probuphine"
   "Prochlorperazine"
   "Progesterone"
   "Prolia"
   "Promethazine"
   "Propranolol"
   "Proscar"
   "Protonix"
   "Provenge"
   "Prozac"
   "Pseudoephedrine"
   "Pyridium"
   "QNASL"
   "Qbrelis"
   "Qbrexza"
   "Qdolo"
   "Qelbree"
   "Qinlock"
   "Qmiiz ODT"
   "Qsymia"
   "Qtern"
   "Qternmet XR"
   "Qualaquin"
   "Quassia"
   "Quazepam"
   "Qudexy XR"
   "Quelicin"
   "Quercetin"
   "Questran"
   "Questran Light"
   "Quetiapine"
   "Quibron-T/SR"
   "QuilliChew ER"
   "Quillivant XR"
   "Quinapril"
   "Quinidine"
   "Quinine"
   "Qutenza"
   "Qvar"
   "Qvar Redihaler"
   "Rabeprazole"
   "Raloxifene"
   "Ramelteon"
   "Ramipril"
   "Ranexa"
   "Ranitidine"
   "Ranolazine"
   "Rapamune"
   "Reclast"
   "Reglan"
   "Relafen"
   "Relugolix"
   "Remdesivir"
   "Remeron"
   "Remicade"
   "Renvela"
   "Repaglinide"
   "Repatha"
   "Requip"
   "Restasis"
   "Restoril"
   "Retevmo"
   "Revlimid"
   "Rexulti"
   "Reyvow"
   "Rifampin"
   "Rifaximin"
   "Rinvoq"
   "Risdiplam"
   "Risedronate"
   "Risperdal"
   "Risperidone"
   "Ritalin"
   "Rituxan"
   "Rituximab"
   "Rivaroxaban"
   "Rivastigmine"
   "Rizatriptan"
   "Robaxin"
   "Robitussin"
   "Rocephin"
   "Ropinirole"
   "Rosuvastatin"
   "Roxicodone"
   "Ruconest"
   "Rybelsus"
   "Rydapt"
   "Rytary"
   "Sabril"
   "Salbutamol"
   "Salmeterol"
   "Sandostatin"
   "Saxenda"
   "Scopolamine"
   "Semaglutide"
   "Senna"
   "Senokot"
   "Sernivo"
   "Seroquel"
   "Sertraline"
   "Sevelamer"
   "Shingrix"
   "Sildenafil"
   "Silvadene"
   "Simethicone"
   "Simvastatin"
   "Sinemet"
   "Singulair"
   "Sitagliptin"
   "Skelaxin"
   "Skyrizi"
   "Sodium bicarbonate"
   "Sodium chloride"
   "Sofosbuvir"
   "Solifenacin"
   "Soliqua"
   "SoluMEDROL"
   "Soma"
   "Somatuline Depot"
   "Somavert"
   "Sotalol"
   "Sovaldi"
   "Spinraza"
   "Spiriva"
   "Spironolactone"
   "Sprintec"
   "Sprycel"
   "Stelara"
   "Strattera"
   "Stribild"
   "Sublocade"
   "Suboxone"
   "Subutex"
   "Sucralfate"
   "Sudafed"
   "Sulfamethoxazole and trimethoprim"
   "Sulfasalazine"
   "Sumatriptan"
   "Suprax"
   "Sutent"
   "Symbicort"
   "Sympazan"
   "Synthroid"
   "Tacrolimus"
   "Tadalafil"
   "Takhzyro"
   "Taltz"
   "Tamiflu"
   "Tamoxifen"
   "Tamsulosin"
   "Tapentadol"
   "Tazarotene"
   "Tazorac"
   "Tecartus"
   "Tecentriq"
   "Tegretol"
   "Telmisartan"
   "Temazepam"
   "Temovate"
   "Tenormin"
   "Tepezza"
   "Terazosin"
   "Terbinafine"
   "Testosterone"
   "Tetracycline"
   "Theophylline"
   "Thiamine"
   "Tibsovo"
   "Timolol"
   "Tiotropium"
   "Tizanidine"
   "Tolterodine"
   "Topamax"
   "Topiramate"
   "Toprol XL"
   "Toradol"
   "Torsemide"
   "Toujeo"
   "Tradjenta"
   "Tramadol"
   "Tranexamic acid"
   "Trazodone"
   "Treanda"
   "Trelegy Ellipta"
   "Tremfya"
   "Tresiba"
   "Triamcinolone"
   "Triamterene"
   "Trileptal"
   "Trimethoprim"
   "Trintellix"
   "Triumeq"
   "Trokendi XR"
   "Trulicity"
   "Truvada"
   "Truxima"
   "Twirla"
   "Tylenol"
   "Tylenol with Codeine #3"
   "Tysabri"
   "Ubiquinone"
   "Ubrelvy"
   "Ubrogepant"
   "Uceris"
   "Udenyca"
   "Ukoniq"
   "Uloric"
   "Ultomiris"
   "Ultracet"
   "Ultram"
   "Ultram ER"
   "Ultravate"
   "Umeclidinium"
   "Umeclidinium and vilanterol"
   "Unasyn"
   "Uniphyl"
   "Unisom"
   "Unisom Sleep Gels"
   "Unithroid"
   "Unituxin"
   "Upadacitinib"
   "Uplizna"
   "Upneeq"
   "Uptravi"
   "Urea Cream"
   "Urea topical"
   "Urecholine"
   "Uretron D/S"
   "Uribel"
   "Uricalm"
   "Urised"
   "Urispas"
   "Urocit-K"
   "Urogesic-Blue"
   "Urokinase"
   "Uroxatral"
   "Urso"
   "Ursodiol"
   "Ustekinumab"
   "Uva Ursi"
   "VESIcare"
   "Valacyclovir"
   "Valium"
   "Valproic acid"
   "Valsartan"
   "Valtoco"
   "Valtrex"
   "Vancomycin"
   "Vanos"
   "Varenicline"
   "Vascepa"
   "Vasopressin"
   "Vasotec"
   "Venclexta"
   "Venetoclax"
   "Venlafaxine"
   "Venofer"
   "Ventolin"
   "Ventolin HFA"
   "Verapamil"
   "Versed"
   "Verzenio"
   "Viagra"
   "Vibramycin"
   "Vicodin"
   "Victoza"
   "Viibryd"
   "Vilazodone"
   "Vimpat"
   "Vistaril"
   "Vitamin A"
   "Vitamin B 12"
   "Vitamin B6"
   "Vitamin C"
   "Vitamin D"
   "Vitamin D3"
   "Vitamin E"
   "Vivitrol"
   "Voltaren"
   "Voltaren Gel"
   "Voriconazole"
   "Vortioxetine"
   "Vosevi"
   "Votrient"
   "Vraylar"
   "Vyndamax"
   "Vyvanse"
   "WP Thyroid"
   "Wakix"
   "Wal-Zyr D"
   "Wal-itin"
   "Warfarin"
   "Wart Remover"
   "Welchol"
   "Wellbutrin"
   "Wellbutrin SR"
   "Wellbutrin XL"
   "Westcort"
   "White Mulberry"
   "Wilate"
   "Wild yam"
   "Willow Bark"
   "Wilzin"
   "WinRho"
   "Winlevi"
   "Winpred"
   "Witch Hazel"
   "Witch hazel topical"
   "Wixela Inhub"
   "Wormwood"
   "Wymzya Fe"
   "Xadago"
   "Xalatan"
   "Xalkori"
   "Xanax"
   "Xanax XR"
   "Xarelto"
   "Xcopri"
   "Xeljanz"
   "Xeljanz XR"
   "Xeloda"
   "Xelpros"
   "Xenical"
   "Xenleta"
   "Xeomin"
   "Xgeva"
   "Xhance"
   "Xiaflex"
   "Xifaxan"
   "Xigduo XR"
   "Xiidra"
   "Xofigo"
   "Xofluza"
   "Xolair"
   "Xolegel"
   "Xopenex"
   "Xopenex HFA"
   "Xospata"
   "Xtampza ER"
   "Xtandi"
   "Xulane"
   "Xultophy"
   "Xylitol"
   "Xylocaine"
   "Xylocaine Dental"
   "Xylocaine Jelly"
   "Xylometazoline nasal"
   "Xyosted"
   "Xyrem"
   "Xywav"
   "Xyzal"
   "Yasmin"
   "Yaz"
   "Yellow fever vaccine"
   "Yervoy"
   "Yescarta"
   "Yohimbe"
   "Yohimbine"
   "Yondelis"
   "Yupelri"
   "Yuvafem"
   "Zaditor"
   "Zafirlukast"
   "Zaleplon"
   "Zanaflex"
   "Zantac"
   "Zaroxolyn"
   "Zarxio"
   "Zebeta"
   "Zenpep"
   "Zestoretic"
   "Zestril"
   "Zetia"
   "Ziac"
   "Zidovudine"
   "Zinc"
   "Zinc gluconate"
   "Zinc sulfate"
   "Ziprasidone"
   "Zithromax"
   "Zocor"
   "Zofran"
   "Zofran ODT"
   "Zoladex"
   "Zoledronic acid"
   "Zolmitriptan"
   "Zoloft"
   "Zolpidem"
   "Zometa"
   "Zomig"
   "Zonegran"
   "Zonisamide"
   "Zosyn"
   "Zovirax"
   "Zubsolv"
   "Zyban"
   "Zydelig"
   "Zykadia"
   "Zyloprim"
   "Zyprexa"
   "Zyrtec"
   "Zytiga"
   "Zyvox"
   "Other"])
