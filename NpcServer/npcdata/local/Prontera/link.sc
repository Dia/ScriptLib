//------------------------------------------------------------------------//
//Beta Link

//------------------------------------------------------------------------//
//  수정사항
// 2004-07-29   성기철(레벨디자인)
// 페이욘 리모델링으로 인한 워프수정


//------------------------------------------------------------------------//
// 수정사항
// 20070913 에피소드 12로 인해 모로코 기존 링크 사용안함

//------------------------------------------------------------------------//
// Town-Field Link

warp "prt_fild01" "North Field-Siege" 199 24 3 2
OnTouch2:
	moveto "prt_gld" 159 293
	return

warp "prontera" "prt-East Field" 289 203 2 3
OnTouch2:
	moveto "prt_fild06" 27 193
	return

warp "prt_fild06" "East Field-prt" 23 193 2 3
OnTouch2:
	moveto "prontera" 285 203
	return

warp "prontera" "prt-South Field" 156 22 3 2
OnTouch2:
	moveto "prt_fild08" 170 375 
	return

warp "prt_fild08" "South Field-prt" 170 378 3 2
OnTouch2:
	moveto "prontera" 156 26
	return

warp "prontera" "prt-West Field" 22 203 2 3
OnTouch2:
	moveto "prt_fild05" 367 205
	return

warp "prt_fild05" "West Field-prt" 373 205 3 3
OnTouch2:
	moveto "prontera" 26 203 
	return

//------------------------------------------------------------------------//
// City Hall

warp "prt_in"	"City HallA" 234 163 1 3
OnTouch2:
	moveto	"prt_in" 215 163
	return

warp "prt_in"	"City HallA'" 217 163 1 3
OnTouch2:
	moveto	"prt_in" 236 163
	return

warp "prt_in"	"City HallAo" 208 179 3 1
OnTouch2:
	moveto	"prontera" 76 102
	return

warp "prontera"	"City HallAi" 73 100 1 1
OnTouch2:
	moveto	"prt_in" 208 176
	return

warp "prt_in"	"City HallB" 263 163 1 3
OnTouch2:
	moveto	"prt_in" 276 163
	return

warp "prt_in"	"City HallB'" 274 163 1 3
OnTouch2:
	moveto	"prt_in" 261 163 
	return

warp "prt_in"	"City HallBo" 282 179 3 1
OnTouch2:
	moveto	"prontera" 87 91
	return

warp "prontera"	"City HallBi" 84 89 1 1
OnTouch2:
	moveto	"prt_in" 282 176
	return

warp "prt_in"	"City HallCo" 248 173 3 2
OnTouch2:
	moveto	"prontera" 77 93
	return

warp "prontera"	"City HallCi" 74 90 2 2
OnTouch2:
	moveto	"prt_in" 248 170
	return

//------------------------------------------------------------------------//
// Church

warp "prt_church"	"Churcho"	100 56 7 1
OnTouch2:
	moveto	"prontera" 234 314
	return

warp "prontera"	"Churchi" 237 317 2 2
OnTouch2:
	moveto	"prt_church" 100 60
	return

//------------------------------------------------------------------------//
// Inn1

warp "prt_in"	"Inno" 240 141 3 1
OnTouch2:
	moveto	"prontera" 107 218
	return

warp "prontera"	"Inni" 107 215 2 2
OnTouch2:
	moveto "prt_in" 240 139
	return

warp "prt_in"	"Inn2F'" 256 131 2 2
OnTouch2:
	moveto	"prt_in" 254 110
	return

warp "prt_in"	"Inn1F'" 254 113 3 2
OnTouch2:
	moveto	"prt_in" 256 134
	return

//------------------------------------------------------------------------//
// Inn2

warp "prt_in"	"Inno" 68 130 2 1
OnTouch2:
	moveto	"prontera" 204 188
	return

warp "prontera"	"Inni" 204 192 2 2
OnTouch2:
	moveto "prt_in" 68 134
	return

warp "prt_in"	"Inn2F'" 70 143 2 1
OnTouch2:
	moveto	"prt_in" 70 165
	return

warp "prt_in"	"Inn1F'" 70 162 2 1
OnTouch2:
	moveto	"prt_in" 70 140
	return


//------------------------------------------------------------------------//
// Trading Post

warp "prt_in"	"Trading PostA" 48 65 1 3
OnTouch2:
	moveto	"prt_in" 34 65
	return

warp "prt_in"	"Trading PostA'" 37 65 1 3
OnTouch2:
	moveto	"prt_in" 51 65 
	return

warp "prt_in"	"Trading PostB" 69 65 1 3
OnTouch2:
	moveto	"prt_in" 85 65
	return

warp "prt_in"	"Trading PostB'" 82 65 1 3
OnTouch2:
	moveto	"prt_in" 66 65
	return

warp "prt_in"	"Trading PostCo" 60 77 2 1
OnTouch2:
	moveto	"prontera" 175 188
	return

warp "prontera"	"Trading PostCi" 179 184 2 2
OnTouch2:
	moveto "prt_in" 60 73
	return

//------------------------------------------------------------------------//
// Armory

warp "prt_in"	"Armoryo" 168 124 2 1
OnTouch2:
	moveto	"prontera" 174 218
	return

warp "prontera"	"Armoryi" 177 221 2 2
OnTouch2:
	moveto "prt_in" 168 128
	return


//------------------------------------------------------------------------//
// Library L

warp "prt_in"	"Libraryo" 183 97 1 2
OnTouch2:
	moveto	"prontera" 120 264
	return

warp "prontera"	"Libraryi" 120 267 2 2
OnTouch2:
	moveto	"prt_in" 180 97
	return


//------------------------------------------------------------------------//
// Library R

warp "prt_in"	"Libraryo" 181 55 1 2
OnTouch2:
	moveto	"prontera" 192 264
	return

warp "prontera"	"Libraryi" 192 267 2 2
OnTouch2:
	moveto	"prt_in" 178 55
	return

//------------------------------------------------------------------------//
// Pub 1

warp "prt_in" "Pubo" 47 29 2 1
OnTouch2:
	moveto	"prontera" 46 67
	return

warp "prontera" "Pubi" 42 67 2 2
OnTouch2:
	moveto	"prt_in" 44 29
	return

//------------------------------------------------------------------------//
// Pub 2

warp "prt_in"	"Pubo" 172 33 2 1
OnTouch2:
	moveto	"prontera" 205 157
	return

warp "prontera"	"Pubi" 208 154 2 2
OnTouch2:
	moveto	"prt_in" 172 29
	return
//------------------------------------------------------------------------//
// Kit Shop

warp "prt_in"	"Kit Shopo" 135 71 1 2
OnTouch2:
	moveto	"prontera" 136 219
	return

warp "prontera"	"Kit Shopi" 132 222 1 1
OnTouch2:
	moveto	"prt_in" 131 71 
	return

//------------------------------------------------------------------------//
// Job Agency

warp "prt_in"	"Job Agencyo" 53 105 1 2
OnTouch2:
	moveto	"prontera" 136 186
	return

warp "prontera"	"Job Agencyi" 133 183 2 2
OnTouch2:
	moveto	"prt_in" 50 105
	return

//------------------------------------------------------------------------//
// Chivarly

warp "prt_in"	"Chivarlyo" 80 113 2 1
OnTouch2:
	moveto	"prontera" 48 343
	return

warp "prontera"	"Chivarlyi" 45 346 2 2
OnTouch2:
	moveto	"prt_in" 80 110
	return

//------------------------------------------------------------------------//
//Exit

warp "prt_in" "Upper" 285 130 6 6
OnTouch2:
	moveto	"prontera" 147 287
	return

warp "prt_in" "2nd" 282 100 6 6
OnTouch2:
	moveto	"prontera" 147 287
	return

warp "prt_in" "3rd" 280 68 6 6
OnTouch2:
	moveto	"prontera" 147 287
	return

warp "prt_in" "3rd" 281 36 6 6
OnTouch2:
	moveto	"prontera" 147 287
	return

//------------------------------------------------------------------------//
// Field

warp "prt_fild01" "01a-02a" 382 351 2 8
OnTouch2:
	moveto	"prt_fild02" 20 350
	return

warp "prt_fild02" "02a-01a" 17 350 2 7
OnTouch2:
	moveto	"prt_fild01" 379 351
	return

warp "prt_fild01" "01b-02b" 382 304 2 10
OnTouch2:
	moveto	"prt_fild02" 20 305
	return

warp "prt_fild02" "02b-01b" 17 305 2 5
OnTouch2:
	moveto	"prt_fild01" 379 302
	return

warp "prt_fild01" "01c-02e" 380 243 2 5
OnTouch2:
	moveto	"prt_fild02" 20 242
	return

warp "prt_fild02" "02e-01c" 17 242 2 5
OnTouch2:
	moveto	"prt_fild01" 377 243
	return

warp "prt_fild02" "02c-03a" 380 347 2 10
OnTouch2:
	moveto	"prt_fild03" 23 249
	return

warp "prt_fild03" "03a-02c" 16 249 2 10
OnTouch2:
	moveto	"prt_fild02" 373 353
	return

warp "prt_fild02" "02d-06a" 305 17 10 2
OnTouch2:
	moveto	"prt_fild06" 277 315
	return

warp "prt_fild06" "06a-02d" 277 320 10 2
OnTouch2:
	moveto	"prt_fild02" 305 22
	return

//---------------------------------------------
warp "prt_fild05" "05a-04a" 15 333 2 8
OnTouch2:
	moveto	"prt_fild04" 380 332
	return

warp "prt_fild04" "04a-05a" 384 334 2 6
OnTouch2:
	moveto	"prt_fild05" 20 333
	return

warp "prt_fild05" "05e-04f" 14 141 2 18
OnTouch2:
	moveto	"prt_fild04" 380 158 
	return

warp "prt_fild04" "04f-05e" 384 155 2 7
OnTouch2:
	moveto	"prt_fild05" 20 134
	return

warp "prt_fild05" "05b-04b" 13 63 2 15
OnTouch2:
	moveto	"prt_fild04" 374 73
	return

warp "prt_fild04" "04b-05b" 378 72 2 6
OnTouch2:
	moveto	"prt_fild05" 17 59
	return

warp "prt_fild05" "05c-07c" 134 14 14 3
OnTouch2:
	moveto	"prt_fild07" 129 374
	return

warp "prt_fild07" "07c-05c" 132 381 9 3
OnTouch2:
	moveto	"prt_fild05" 142 18
	return

warp "prt_fild05" "05d-07d" 255 14 12 2
OnTouch2:
	moveto	"prt_fild07" 248 369
	return

warp "prt_fild07" "07d-05d" 248 376 8 2
OnTouch2:
	moveto	"prt_fild05" 257 18
	return

//---------------------------------------------

warp "prt_fild04" "04c-00b" 160 387 10 2
OnTouch2:
	moveto	"prt_fild00" 164 24
	return

warp "prt_fild00" "00b-04c" 165 18 9 3
OnTouch2:
	moveto	"prt_fild04" 158 384
	return

warp "prt_fild04" "04e-00c" 323 387 7 2
OnTouch2:
	moveto	"prt_fild00" 315 21
	return

warp "prt_fild00" "00c-04e" 317 18 8 2
OnTouch2:
	moveto	"prt_fild04" 323 384
	return

warp "prt_fild00" "00a-g00a" 18 129 2 6
OnTouch2:
	moveto	"gef_fild00" 376 140
	return

warp "gef_fild00" "g00a-00a" 381 137 3 9
OnTouch2:
	moveto	"prt_fild00" 24 125
	return

warp "prt_fild04" "04d-g01a" 17 114 2 10
OnTouch2:
	moveto	"gef_fild01" 375 111
	return

warp "gef_fild01" "g01a-04d" 382 111 2 9
OnTouch2:
	moveto	"prt_fild04" 20 114
	return

warp "prt_fild07" "07a-g02a" 14 289 3 10
OnTouch2:
	moveto	"gef_fild02" 375 292
	return

warp "gef_fild02" "g02a-07a" 380 289 3 12
OnTouch2:
	moveto	"prt_fild07" 18 289 
	return

warp "prt_fild07" "07b-g02b" 17 145 3 12
OnTouch2:
	moveto	"gef_fild02" 376 156
	return

warp "gef_fild02" "g02b-07b" 380 156 3 7
OnTouch2:
	moveto	"prt_fild07" 21 143 
	return

warp "prt_fild07" "07g-g02c" 13 64 3 8
OnTouch2:
	moveto	"gef_fild02" 376 69 
	return

warp "gef_fild02" "g02c-07g" 380 68 3 10
OnTouch2:
	moveto	"prt_fild07" 17 64
	return

warp "prt_fild07" "07e-08a" 383 239 3 20
OnTouch2:
	moveto	"prt_fild08" 20 239
	return

warp "prt_fild08" "08a-07e" 16 239 3 15
OnTouch2:
	moveto	"prt_fild07" 379 239
	return

warp "prt_fild07" "07f-08b" 385 186 3 20
OnTouch2:
	moveto	"prt_fild08" 20 186
	return
	
warp "prt_fild08" "08b-07f" 16 187 3 17
OnTouch2:
	moveto	"prt_fild07" 380 186
	return

warp "prt_fild08" "08c1-m01a" 233 16 12 1
OnTouch2:
	moveto	"moc_fild01" 238 378
	return

warp "moc_fild01" "m01-08c" 239 382 12 1
OnTouch2:
	moveto	"prt_fild08" 233 20
	return

warp "prt_fild08" "08d-m01d" 55 21 4 2
OnTouch2:
	moveto	"moc_fild01" 56 380
	return

warp "moc_fild01" "m01d-08d" 56 384 3 2
OnTouch2:
	moveto	"prt_fild08" 54 24
	return
/*
warp "moc_fild01" "m01b1-m04a" 68 16 15 3
OnTouch2:
	moveto	"moc_fild04" 317 376
	return

warp "moc_fild01" "m01b2-m04a" 101 16 15 3
OnTouch2:
	moveto	"moc_fild04" 317 376
	return

warp "moc_fild04" "m04a1-m01b" 292 381 10 1
OnTouch2:
	moveto	"moc_fild01" 76 25 
	return

warp "moc_fild04" "m04a2-m01b" 314 381 10 1
OnTouch2:
	moveto	"moc_fild01" 76 25 
	return

warp "moc_fild04" "m04a3-m01b" 336 381 10 1
OnTouch2:
	moveto	"moc_fild01" 76 25 
	return
*/
warp "moc_fild01" "m01c1-m02a" 301 16 10 1
OnTouch2:	
	moveto	"moc_fild02" 77 338
	return

warp "moc_fild01" "m01c2-m02a" 321 16 10 1
OnTouch2:
	moveto	"moc_fild02" 77 338
	return

warp "moc_fild01" "m01c2-m02a" 341 16 10 1
OnTouch2:
	moveto	"moc_fild02" 77 338
	return

warp "moc_fild02" "m02c1-m01a" 67 342 11 3
OnTouch2:
	moveto	"moc_fild01" 315 25
	return

warp "moc_fild02" "m02c2-m01a" 92 342 11 3
OnTouch2:
	moveto	"moc_fild01" 315 25
	return
/*
warp "moc_fild04" "m04b-m05b" 19 206 3 15
OnTouch2:
	moveto	"moc_fild05" 373 208
	return

warp "moc_fild05" "m05b-m04b" 378 208 3 14
OnTouch2:
	moveto	"moc_fild04" 26 206
	return

warp "moc_fild04" "m04c1-m05c" 14 146 1 11
OnTouch2:
	moveto	"moc_fild05" 378 119
	return

warp "moc_fild04" "m04c2-m05c" 14 122 1 11
OnTouch2:
	moveto	"moc_fild05" 378 119
	return

warp "moc_fild04" "m04c3-m05c" 14 98 1 11
OnTouch2:
	moveto	"moc_fild05" 378 119
	return

warp "moc_fild05" "m05c1-m04c" 384 144 1 8
OnTouch2:
	moveto	"moc_fild04" 22 123
	return

warp "moc_fild05" "m05c3-m04c" 384 126 1 8
OnTouch2:
	moveto	"moc_fild04" 22 123
	return

warp "moc_fild05" "m05c3-m04c" 384 108 1 8
OnTouch2:
	moveto	"moc_fild04" 22 123
	return

warp "moc_fild05" "m05a1-m06b" 18 172 1 8
OnTouch2:
	moveto	"moc_fild06" 367 317
	return

warp "moc_fild05" "m05a2-m06b" 18 154 1 8
OnTouch2:
	moveto	"moc_fild06" 367 317
	return

warp "moc_fild05" "m05a2-m06b" 18 136 1 8
OnTouch2:
	moveto	"moc_fild06" 367 317
	return

warp "moc_fild06" "m06b-m05a" 377 316 1 15
OnTouch2:
	moveto	"moc_fild05" 24 153 
	return

warp "moc_fild06" "m06a1-m07a" 18 198 1 18
OnTouch2:
	moveto	"moc_fild07" 378 201
	return

warp "moc_fild07" "m07a-m06a" 381 201 2 16
OnTouch2:
	moveto	"moc_fild06" 28 201
	return
*/
warp "moc_fild07" "m07a-moc" 198 21 2 2
OnTouch2:
	moveto	"morocc" 160 294
	return

warp "morocc" "moc-m07b" 160 297 2 2
OnTouch2:
	moveto	"moc_fild07" 198 25
	return

warp "moc_fild02" "m02b-m03a" 332 19 5 3
OnTouch2:
	moveto	"moc_fild03" 70 336
	return

warp "moc_fild03" "m03a-m02b" 70 341 5 2
OnTouch2:
	moveto	"moc_fild02" 332 23
	return

warp "moc_fild03" "m03b-p01a" 303 170 2 7
OnTouch2:
	moveto	"pay_fild01" 17 152
	return

warp "pay_fild01" "p01a-m03b" 13 152 2 7
OnTouch2:
	moveto	"moc_fild03" 299 170 
	return

warp "pay_fild01" "p01b-p02a" 278 14 13 2
OnTouch2:
	moveto	"pay_fild02" 83 382
	return

warp "pay_fild02" "p02a-p01b" 83 386 13 2
OnTouch2:
	moveto	"pay_fild01" 278 18
	return

warp "pay_fild01" "p01d-p02c" 353 14 20 3
OnTouch2:
	moveto	"pay_fild02" 160 381
	return

warp "pay_fild02" "p02c-p01d" 167 390 20 3
OnTouch2:
	moveto	"pay_fild01" 354 18
	return

warp "pay_fild02" "p02b-p03a" 284 108 2 7
OnTouch2:
	moveto	"pay_fild03" 20 110
	return

warp "pay_fild03" "p03a-p02b" 15 110 2 10
OnTouch2:
	moveto	"pay_fild02" 280 108
	return


//------------------------------------------------------------------------//
// Culvert B1

warp "prt_sewb1" "B1-Exit" 135 248 2 2
OnTouch2:
	moveto "prt_fild05" 274 208
	return

warp "prt_sewb1" "B1-B2" 188 247 1 3
OnTouch2:
	moveto "prt_sewb2" 19 19 
	return

warp "prt_sewb2" "B2-B1" 19 12 2 2
OnTouch2:
	moveto "prt_sewb1" 192 247
	return

warp "prt_sewb2" "CulvertB2a" 19 175 4 2
OnTouch2:
	moveto "prt_sewb2" 60 28
	return

warp "prt_sewb2" "CulvertB2a'" 60 24 4 2
OnTouch2:
	moveto "prt_sewb2" 19 171
	return

warp "prt_sewb2" "CulvertB2b" 100 176 4 2
OnTouch2:
	moveto "prt_sewb2" 140 28
	return

warp "prt_sewb2" "CulvertB2b'" 140 24 4 2
OnTouch2:
	moveto "prt_sewb2" 100 172
	return

warp "prt_sewb2" "B2 - B3" 180 24 4 2
OnTouch2:
	moveto "prt_sewb3" 180 169
	return

warp "prt_sewb3" "B3 - B2" 180 173 4 2
OnTouch2:
	moveto "prt_sewb2" 180 28
	return

warp "prt_sewb3" "B3 - B4" 20 185 3 2
OnTouch2:
	moveto "prt_sewb4" 100 92
	return

warp "prt_sewb4" "B4 - B3" 100 96 3 2
OnTouch2:
	moveto "prt_sewb3" 19 180
	return

//--------------------------------------------------------------------------------------------------
//Prontera Maze - 1

//--------------------------------------------------------------------------------------------------
//Prontera Maze - 1
/*
warp "prt_fild01" "Entrance" 136 373 2 2
OnTouch2:
	moveto "prt_maze01" 176 7
	return

warp "prt_maze01" "Exit" 176 4 8 2
OnTouch2:
	moveto "prt_fild01" 136 368
	return

warp "prt_maze01" "A-A'" 176 35 5 3
OnTouch2:
	moveto "prt_maze01" 182 88
	return

warp "prt_maze01" "A'-A" 182 84 5 2
OnTouch2:
	moveto "prt_maze01" 177 31
	return

warp "prt_maze01" "C-C'" 164 22 2 5
OnTouch2:
	moveto "prt_maze01" 112 21
	return

warp "prt_maze01" "C'-C" 115 21 2 5
OnTouch2:
	moveto "prt_maze01" 167 22 
	return

warp "prt_maze01" "D-D'" 195 15 2 5
OnTouch2:
	moveto "prt_maze01" 47 105
	return

warp "prt_maze01" "D'-D" 44 105 2 5
OnTouch2:
	moveto "prt_maze01" 192 15 
	return

warp "prt_maze01" "H-H'" 155 21 2 12
OnTouch2:
	moveto "prt_maze01" 87 13
	return

warp "prt_maze01" "H'-H" 84 10 2 5
OnTouch2:
	moveto "prt_maze01" 152 25
	return

warp "prt_maze01" "Q-Q'" 63 84 6 2
OnTouch2:
	moveto "prt_maze01" 58 192
	return

warp "prt_maze01" "Q'-Q1" 51 195 7 2
OnTouch2:
	moveto "prt_maze01" 63 88
	return

warp "prt_maze01" "Q'-Q2" 63 195 7 2
OnTouch2:
	moveto "prt_maze01" 63 88
	return

warp "prt_maze01" "G-G'" 100 35 5 2
OnTouch2:
	moveto "prt_maze01" 139 47
	return

warp "prt_maze01" "G'-G" 139 44 5 2
OnTouch2:
	moveto "prt_maze01" 100 32
	return

warp "prt_maze01" "B-B'" 75 11 2 5
OnTouch2:
	moveto "prt_maze01" 167 93
	return

warp "prt_maze01" "B'-B" 164 93 2 5
OnTouch2:
	moveto "prt_maze01" 72 11 
	return

warp "prt_maze01" "I-I'" 54 4 5 2
OnTouch2:
	moveto "prt_maze01" 105 71
	return

warp "prt_maze01" "I'-I" 105 75 5 2
OnTouch2:
	moveto "prt_maze01" 54 8
	return

warp "prt_maze01" "J-J'" 44 23 2 5
OnTouch2:
	moveto "prt_maze01" 192 174
	return

warp "prt_maze01" "J'-J" 195 174 2 5
OnTouch2:
	moveto "prt_maze01" 47 23
	return

warp "prt_maze01" "O-O'" 17 34 5 3
OnTouch2:
	moveto "prt_maze01" 23 128
	return

warp "prt_maze01" "O'-O" 23 124 5 2
OnTouch2:
	moveto "prt_maze01" 17 30
	return

warp "prt_maze01" "P-P'" 25 5 5 3
OnTouch2:
	moveto "prt_maze01" 65 113
	return

warp "prt_maze01" "P'-P" 65 116 5 2
OnTouch2:
	moveto "prt_maze01" 23 9
	return

//warp "prt_maze01" "d-d'" 178 75 3 2
//moveto "prt_maze01" 
//return

//warp "prt_maze01" "d'-d"  
//moveto "prt_maze01" 178 72
//return

warp "prt_maze01" "e-e'" 195 55 2 5
OnTouch2:
	moveto "prt_maze01" 87 97
	return

warp "prt_maze01" "e'-e" 84 97 2 5
OnTouch2:
	moveto "prt_maze01" 192 55
	return

warp "prt_maze01" "f-f'" 176 44 5 2
OnTouch2:
	moveto "prt_maze01" 18 152
	return

warp "prt_maze01" "f'-f" 18 155 5 2
OnTouch2:
	moveto "prt_maze01" 176 47
	return

warp "prt_maze01" "F-F'" 140 75 5 2
OnTouch2:
	moveto "prt_maze01" 96 47
	return

warp "prt_maze01" "F'-F" 96 44 5 2
OnTouch2:
	moveto "prt_maze01" 140 72
	return

warp "prt_maze01" "b-b'" 115 56 2 5
OnTouch2:
	moveto "prt_maze01" 7 57 
	return

warp "prt_maze01" "b'-b" 4 57 2 5
OnTouch2:
	moveto "prt_maze01" 112 56
	return

warp "prt_maze01" "E-E'" 84 55 2 5
OnTouch2:
	moveto "prt_maze01" 191 93
	return

warp "prt_maze01" "E'-E" 195 93 2 5
OnTouch2:
	moveto "prt_maze01" 88 55
	return

warp "prt_maze01" "X1-X'" 70 75 7 3
OnTouch2:
	moveto "prt_maze01" 169 140
	return

warp "prt_maze01" "X2-X'" 75 66 3 10
OnTouch2:
	moveto "prt_maze01" 169 140
	return

warp "prt_maze01" "X'-X" 164 140 2 5
OnTouch2:
	moveto "prt_maze01" 70 68
	return

warp "prt_maze01" "Y-Y'" 50 44 4 2
OnTouch2:
	moveto "prt_maze01" 17 111
	return

warp "prt_maze01" "Y'-Y" 17 115 5 2
OnTouch2:
	moveto "prt_maze01" 50 48
	return

warp "prt_maze01" "a-a'" 14 75 5 2
OnTouch2:
	moveto "prt_maze01" 63 128
	return

warp "prt_maze01" "a'-a" 63 124 5 2
OnTouch2:
	moveto "prt_maze01" 14 71
	return

warp "prt_maze01" "M-M'" 142 115 5 2
OnTouch2:
	moveto "prt_maze01" 138 128
	return

warp "prt_maze01" "M'-M" 138 124 5 2
OnTouch2:
	moveto "prt_maze01" 142 111 
	return

warp "prt_maze01" "L-L'" 124 105 2 5
OnTouch2:
	moveto "prt_maze01" 111 96
	return

warp "prt_maze01" "L'-L" 115 96 2 5
OnTouch2:
	moveto "prt_maze01" 128 105
	return

warp "prt_maze01" "K-K'" 105 115 5 2
OnTouch2:
	moveto "prt_maze01" 175 168 
	return

warp "prt_maze01" "K'-K" 175 164 5 2
OnTouch2:
	moveto "prt_maze01" 105 111
	return

warp "prt_maze01" "R-R'" 75 95 2 5
OnTouch2:
	moveto "prt_maze01" 88 173 
	return

warp "prt_maze01" "R'-R" 84 173 2 5
OnTouch2:
	moveto "prt_maze01" 71 95 
	return

warp "prt_maze01" "Z-Z'" 22 84 5 2
OnTouch2:
	moveto "prt_maze01" 55 151
	return

warp "prt_maze01" "Z'-Z" 55 155 5 2
OnTouch2:
	moveto "prt_maze01" 22 88
	return

warp "prt_maze01" "V-V'" 195 139 2 5
OnTouch2:
	moveto "prt_maze01" 129 174
	return

warp "prt_maze01" "V'-V" 124 169 2 5 
OnTouch2:
	moveto "prt_maze01" 191 139 
	return

warp "prt_maze01" "N-N'" 155 133 2 5
OnTouch2:
	moveto "prt_maze01" 8 140
	return

warp "prt_maze01" "N'-N" 4 140 2 5
OnTouch2:
	moveto "prt_maze01" 151 133
	return

warp "prt_maze01" "g-g'" 115 145 2 5
OnTouch2:
	moveto "prt_maze01" 8 186
	return

warp "prt_maze01" "g'-g" 4 186 2 5
OnTouch2:
	moveto "prt_maze01" 111 145 
	return

warp "prt_maze01" "S-S'" 98 155 5 2
OnTouch2:
	moveto "prt_maze01" 102 169
	return

warp "prt_maze01" "S'-S" 102 165 5 2
OnTouch2:
	moveto "prt_maze01" 98 151
	return

warp "prt_maze01" "T-T'" 84 145 2 5
OnTouch2:
	moveto "prt_maze01" 151 181 
	return

warp "prt_maze01" "T'-T" 155 181 2 5
OnTouch2:
	moveto "prt_maze01" 88 145 
	return

warp "prt_maze01" "Maze1-2" 19 195 10 2
OnTouch2:
	moveto	"prt_maze02" 94 19 
	return

warp "prt_maze02" "Maze21-1" 84 15 12 2
OnTouch2:
	moveto	"prt_maze01" 22 191 
	return

warp "prt_maze02" "Maze22-1" 103 15 12 2
OnTouch2:
	moveto	"prt_maze01" 22 191 
	return
*/
//--------------------------------------------------------------------------------------------------
//Maze - 2
/*
warp "prt_maze02" "Maze21-3" 80 182 12 2
OnTouch2:
	moveto	"prt_maze03" 23 8
	return

warp "prt_maze02" "Maze22-3" 108 182 12 2
OnTouch2:
	moveto	"prt_maze03" 23 8
	return

warp "prt_maze03" "Maze3-2" 25 4 8 3
OnTouch2:
	moveto	"prt_maze02" 95 177
	return

warp "prt_maze03" "A-A'" 18 34 5 3
OnTouch2:
	moveto	"prt_maze03" 175 168
	return

warp "prt_maze03" "A'-A" 175 164 5 2
OnTouch2:
	moveto	"prt_maze03" 18 30
	return

warp "prt_maze03" "G-G'" 44 22 2 5
OnTouch2:
	moveto	"prt_maze03" 151 25
	return

warp "prt_maze03" "G'-G" 155 21 2 15
OnTouch2:
	moveto	"prt_maze03" 48 22
	return

warp "prt_maze03" "F-F'" 54 4 5 2
OnTouch2:
	moveto	"prt_maze03" 14 71
	return

warp "prt_maze03" "F'-F" 14 75 5 2
OnTouch2:
	moveto	"prt_maze03" 54 8
	return

warp "prt_maze03" "H-H'" 75 12 2 5
OnTouch2:
	moveto	"prt_maze03" 88 13 
	return

warp "prt_maze03" "H'-H" 84 10 2 5
OnTouch2:
	moveto	"prt_maze03" 71 12
	return

warp "prt_maze03" "D-D'" 100 35 4 2
OnTouch2:
	moveto	"prt_maze03" 63 88 
	return

warp "prt_maze03" "D'-D" 63 84 4 2
OnTouch2:
	moveto	"prt_maze03" 100 31
	return

warp "prt_maze03" "I-I'" 115 21 2 4
OnTouch2:
	moveto	"prt_maze03" 128 105
	return

warp "prt_maze03" "I'-I" 124 105 2 4
OnTouch2:
	moveto	"prt_maze03" 111 21
	return

warp "prt_maze03" "X-X'" 176 35 5 2
OnTouch2:
	moveto	"prt_maze03" 137 127
	return

warp "prt_maze03" "X'-X" 137 124 10 2
OnTouch2:
	moveto	"prt_maze03" 177 32
	return

warp "prt_maze03" "U-U'" 195 16 2 4
OnTouch2:
	moveto	"prt_maze03" 168 139 
	return

warp "prt_maze03" "U'-U" 164 139 2 4
OnTouch2:
	moveto	"prt_maze03" 191 16
	return

warp "prt_maze03" "E-E'" 4 57 2 4
OnTouch2:
	moveto	"prt_maze03" 71 95
	return

warp "prt_maze03" "E'-E" 75 95 2 4
OnTouch2:
	moveto	"prt_maze03" 8 57
	return

warp "prt_maze03" "R-R'" 49 44 10 2
OnTouch2:
	moveto	"prt_maze03" 17 112
	return

warp "prt_maze03" "R'-R" 17 115 8 2
OnTouch2:
	moveto	"prt_maze03" 49 47
	return

warp "prt_maze03" "Q1-Q'" 71 75 6 2
OnTouch2:
	moveto	"prt_maze03" 127 173
	return

warp "prt_maze03" "Q2-Q'" 75 64 2 10
OnTouch2:
	moveto	"prt_maze03" 127 173
	return

warp "prt_maze03" "Q'-Q" 124 168 2 8
OnTouch2:
	moveto	"prt_maze03" 69 69
	return

warp "prt_maze03" "O-O'" 84 56 2 3
OnTouch2:
	moveto	"prt_maze03" 151 181 
	return

warp "prt_maze03" "O'-O" 155 181 2 3
OnTouch2:
	moveto	"prt_maze03" 88 56
	return

warp "prt_maze03" "P-P'" 105 75 6 2
OnTouch2:
	moveto	"prt_maze03" 140 47 
	return

warp "prt_maze03" "P'-P" 140 44 6 2
OnTouch2:
	moveto	"prt_maze03" 105 72
	return

warp "prt_maze03" "N-N'" 97 44 3 2
OnTouch2:
	moveto	"prt_maze03" 140 71
	return

warp "prt_maze03" "N'-N" 140 75 3 2
OnTouch2:
	moveto	"prt_maze03" 97 48
	return

warp "prt_maze03" "M-M'" 115 56 2 3
OnTouch2:
	moveto	"prt_maze03" 88 145 
	return

warp "prt_maze03" "M'-M" 84 145 2 3
OnTouch2:
	moveto	"prt_maze03" 111 56 
	return

warp "prt_maze03" "g-g'" 178 75 3 2
OnTouch2:
	moveto	"prt_maze03" 182 88
	return

warp "prt_maze03" "g'-g" 182 84 3 2
OnTouch2:
	moveto	"prt_maze03" 178 71 
	return

warp "prt_maze03" "T-T'" 195 54 2 3
OnTouch2:
	moveto	"prt_maze03" 88 96
	return

warp "prt_maze03" "T'-T" 84 96 2 3
OnTouch2:
	moveto	"prt_maze03" 191 54
	return

warp "prt_maze03" "z-z'" 176 44 7 2
OnTouch2:
	moveto	"prt_maze03" 55 151
	return

warp "prt_maze03" "z'-z" 55 155 3 2
OnTouch2:
	moveto	"prt_maze03" 176 48
	return

warp "prt_maze03" "S-S'" 22 84 6 2
OnTouch2:
	moveto	"prt_maze03" 104 111
	return

warp "prt_maze03" "S'-S" 104 115 4 2
OnTouch2:
	moveto	"prt_maze03" 22 88
	return

warp "prt_maze03" "B-B'" 44 105 2 4
OnTouch2:
	moveto	"prt_maze03" 191 174
	return

warp "prt_maze03" "B'-B" 195 174 2 5
OnTouch2:
	moveto	"prt_maze03" 48 105
	return

warp "prt_maze03" "J-J'" 143 115 3 2
OnTouch2:
	moveto	"prt_maze03" 102 168
	return

warp "prt_maze03" "J'-J" 102 164 3 2
OnTouch2:
	moveto	"prt_maze03" 143 111
	return

warp "prt_maze03" "Y-Y'" 4 140 2 3
OnTouch2:
	moveto	"prt_maze03" 60 192
	return

warp "prt_maze03" "Y'1-Y" 53 195 10 2
OnTouch2:
	moveto	"prt_maze03" 7 140
	return

warp "prt_maze03" "Y'2-Y" 63 195 10 2
OnTouch2:
	moveto	"prt_maze03" 7 140
	return

warp "prt_maze03" "Z-Z'" 18 155 4 2
OnTouch2:
	moveto	"prt_maze03" 63 128 
	return

warp "prt_maze03" "Z'-Z" 63 124 4 2
OnTouch2:
	moveto	"prt_maze03" 18 151
	return

warp "prt_maze03" "L-L'" 23 124 5 2
OnTouch2:
	moveto	"prt_maze03" 98 151 
	return

warp "prt_maze03" "L'-L" 98 155 3 2
OnTouch2:
	moveto	"prt_maze03" 23 128
	return

warp "prt_maze03" "K-K'" 115 145 2 3
OnTouch2:
	moveto	"prt_maze03" 88 173
	return

warp "prt_maze03" "K'-K" 84 173 2 3
OnTouch2:
	moveto	"prt_maze03" 111 145 
	return

warp "prt_maze03" "W-W'" 155 133 2 3
OnTouch2:
	moveto	"prt_maze03" 8 186
	return

warp "prt_maze03" "W'-W" 4 186 2 4 
OnTouch2:	
	moveto	"prt_maze03" 151 133
	return

warp "prt_maze03" "V-V''" 115 96 2 7
OnTouch2:
	moveto	"prt_maze03" 167 22
	return

warp "prt_maze03" "V''-V" 163 22 2 8
OnTouch2:
	moveto	"prt_maze03" 111 95
	return

warp "prt_maze03" "V'-V''" 195 139 2 13
OnTouch2:
	moveto	"prt_maze03" 167 22
	return

warp "prt_maze03" "C-C'" 65 115 4 2
OnTouch2:
	moveto	"prt_maze03" 22 191
	return

warp "prt_maze03" "C'-C" 22 195 4 2
OnTouch2:
	moveto	"prt_maze03" 65 111
	return
*/
//-------------------------------------------------------------------
//Mjolnir
//Mjolnir 4-5

warp "mjolnir_05" "m05c-m04c" 16 171 2 2
OnTouch2:
	moveto  "mjolnir_04" 384 174
	return

warp "mjolnir_04" "m04c-m05c" 387 174 2 2
OnTouch2:
	moveto  "mjolnir_05" 19 171
	return

//Mjolnir 3-4

warp "mjolnir_03" "m03a-m04a" 242 204 1 1
OnTouch2:
	moveto  "mjolnir_04" 125 208
	return

warp "mjolnir_04" "m04a-m03a" 122 208 1 1
OnTouch2:
	moveto  "mjolnir_03" 239 204
	return

//Mjolnir 2-3

warp "mjolnir_02" "m02c-m03c" 326 289 1 1
OnTouch2:
	moveto  "mjolnir_03" 24 258
	return

warp "mjolnir_03" "m03c-m02c" 21 258 2 2
OnTouch2:
	moveto  "mjolnir_02" 323 289

//Mjolnir 1-2

warp "mjolnir_01" "m01a-m02a" 381 256 2 2
OnTouch2:
	moveto  "mjolnir_02" 31 258
	return

warp "mjolnir_02" "m02a-m01a" 28 258 2 2
OnTouch2:
	moveto  "mjolnir_01" 378 256
	return

//Geffen 4-Mjolnir 1,Geffen 4-Geffen Town

warp "gef_fild04" "g04b-m01b" 261 362 4 2
OnTouch2:
	moveto  "mjolnir_01" 284 21
	return

warp "mjolnir_01" "m01b-g04b" 284 18 4 2
OnTouch2:
	moveto  "gef_fild04" 261 359
	return

warp "gef_fild04" "g04d-geffen" 187 39 4 2
OnTouch2:
	moveto  "geffen" 119 210
	return

warp "geffen" "geffen-g04d" 119 213 3 2
OnTouch2:
	moveto  "gef_fild04" 187 42
	return

//Mjolnir 6-Geffen 4, Molnir 6-2

warp "mjolnir_06" "m06a-g04a" 18 331 2 4
OnTouch2:
	moveto  "gef_fild04" 359 322
	return

warp "gef_fild04" "g04a-m06a" 362 322 2 4
OnTouch2:
	moveto  "mjolnir_06" 21 331
	return

warp "mjolnir_06" "m06b-m02b" 366 383 4 2
OnTouch2:
	moveto  "mjolnir_02" 361 21
	return

warp "mjolnir_02" "m02b-m06b" 361 18 4 2
OnTouch2:
	moveto  "mjolnir_06" 366 380
	return

//Mjolnir 7-6,Mjolnir 7-3

warp "mjolnir_07" "m07b-m03b" 214 383 4 2
OnTouch2:
	moveto  "mjolnir_03" 212 20
	return

warp "mjolnir_03" "m03b-m07b" 212 17 4 2
OnTouch2:
	moveto  "mjolnir_07" 214 380
	return

warp "mjolnir_07" "m07c-m06c" 16 377 2 4
OnTouch2:
	moveto  "mjolnir_06" 379 377
	return

warp "mjolnir_06" "m06c-m07c" 382 377 2 4
OnTouch2:
	moveto  "mjolnir_07" 19 377
	return

warp "mjolnir_07" "m07d-m06d" 17 77 2 4
OnTouch2:
	moveto  "mjolnir_06" 380 74
	return

warp "mjolnir_06" "m06d-m07d" 383 74 2 4
OnTouch2:
	moveto  "mjolnir_07" 20 77
	return

//Mjolnir 8-7,Mjolnir 8-4

warp "mjolnir_08" "m08e-m07e" 29 346 2 4
OnTouch2:
	moveto  "mjolnir_07" 380 362
	return

warp "mjolnir_07" "m07e-m08e" 383 362 2 4
OnTouch2:
	moveto  "mjolnir_08" 32 346
	return

warp "mjolnir_08" "m08f-m07f" 30 234 2 4
OnTouch2:
	moveto  "mjolnir_07" 380 233 2 4
	return

warp "mjolnir_07" "m07f-m08f" 383 233 2 4
OnTouch2:
	moveto  "mjolnir_08" 33 234
	return

warp "mjolnir_08" "m08b-m04b" 159 373 1 1
OnTouch2:
	moveto  "mjolnir_04" 160 49 
	return

warp "mjolnir_04" "m04b-m08b" 160 46 4 2
OnTouch2:
	moveto  "mjolnir_08" 159 370
	return

//Geffen 7-8,Geffen 7-Geffen Town

warp "gef_fild07" "g07b-g08b" 18 191 2 4
OnTouch2:
	moveto  "gef_fild08" 357 187
	return

warp "gef_fild08" "g08b-g07b" 360 187 2 4
OnTouch2:
	moveto  "gef_fild07" 21 191
	return
	
warp "gef_fild07" "g07a-geffen" 339 187 2 4
OnTouch2:
	moveto  "geffen" 29 119
	return

warp "geffen" "geffen-g07a" 26 119 2 3
OnTouch2:
	moveto  "gef_fild07" 336 187
	return

//Geffen 5

warp "gef_fild05" "g05c-g04c" 364 309 2 8
OnTouch2:
	moveto  "gef_fild04" 19 309
	return

warp "gef_fild04" "g04c-g05c" 16 309 2 6
OnTouch2:
	moveto  "gef_fild05" 361 309
	return

warp "gef_fild05" "g05d-g07d" 64 15 4 2
OnTouch2:
	moveto  "gef_fild07" 64 360
	return

warp "gef_fild07" "g07d-g05d" 64 363 4 2
OnTouch2:
	moveto  "gef_fild05" 64 18
	return

warp "gef_fild05" "g05b-g06b" 15 201 2 4
OnTouch2:
	moveto  "gef_fild06" 379 211
	return

warp "gef_fild06" "g06b-g05b" 382 211 2 4
OnTouch2:
	moveto  "gef_fild05" 18 201
	return

//Geffen 6

warp "gef_fild06" "g06a-g08a" 218 17 4 2
OnTouch2:
	moveto  "gef_fild08" 200 352
	return
	
warp "gef_fild08" "g08a-g06a" 200 355 4 2
OnTouch2:
	moveto  "gef_fild06" 218 20
	return
	
//Geffen 0-Mjolnir 6

warp "gef_fild00" "g00e-m06e" 267 382 4 2
OnTouch2:
	moveto  "mjolnir_06" 265 32
	return

warp "mjolnir_06" "m06e-g00e" 265 29 2 2
OnTouch2:
	moveto  "gef_fild00" 267 379
	return

//Prontera 0-Mjolnir 7

warp "prt_fild00" "p00b-m07a" 159 383 4 2
OnTouch2:
	moveto  "mjolnir_07" 156 19
	return

warp "mjolnir_07" "m07a-p00b" 156 16 4 2
OnTouch2:
	moveto  "prt_fild00" 159 380
	return

//Mjolnir 9-Prontera 0, Mjolnir 9-Mjolnir 8

warp "mjolnir_09" "m09c-p00c" 30 249 2 4
OnTouch2:
	moveto  "prt_fild00" 380 249
	return

warp "prt_fild00" "p00c-m09c" 383 249 2 4
OnTouch2:
	moveto  "mjolnir_09" 33 248
	return
	
warp "mjolnir_09" "m09b-m08c" 194 367 8 2
OnTouch2:
	moveto  "mjolnir_08" 185 31
	return

warp "mjolnir_08" "m08c-m09b" 185 28 17 2
OnTouch2:
	moveto  "mjolnir_09" 196 364
	return

//Prontera 1-Mjolnir 9

warp "prt_fild01" "p01d-m09a" 20 292 2 3
OnTouch2:
	moveto  "mjolnir_09" 370 288
	return

warp "mjolnir_09" "m09a-p01d" 373 288 2 2
OnTouch2:
	moveto  "prt_fild01" 23 292
	return

//Prontera 2-Mjolnir 11

warp "prt_fild02" "p02a-m11a" 173 382 4 2
OnTouch2:
	moveto  "mjolnir_11" 174 23
	return

warp "mjolnir_11" "m11a-p02a" 174 20 4 2
OnTouch2:
	moveto  "prt_fild02" 173 379
	return

//Prontera 3-Prontera Monk 

warp "prt_fild03" "p03-Monk" 371 256 2 2
OnTouch2:
	moveto  "prt_monk" 25 248
	return

warp "prt_monk" "Monk-p03" 22 248 2 2
OnTouch2:
	moveto  "prt_fild03" 368 256
	return

//Geffen 1-Geffen 9

warp "gef_fild01" "g01b-g09b" 16 102 2 4
OnTouch2:
	moveto  "gef_fild09" 368 92
	return

warp "gef_fild09" "g09b-g01b" 368 95 4 2
OnTouch2:
	moveto  "gef_fild01" 19 102
	return

//Prontera 5-Mjolnir 9

warp "prt_fild05" "p05f-m09d" 105 381 5 2
OnTouch2:
	moveto  "mjolnir_09" 106 34
	return

warp "mjolnir_09" "m09d-p05f" 106 28 4 2
OnTouch2:
	moveto  "prt_fild05" 105 378
	return

warp "prt_fild05" "p05g-m09e" 292 385 4 2
OnTouch2:
	moveto  "mjolnir_09" 305 33
	return

warp "mjolnir_09" "m09e-p05g" 300 28 4 2 
OnTouch2:
	moveto  "prt_fild05" 292 382
	return

//Geffen 10-9(Orc Field)

warp "gef_fild10" "g10a-g09a" 251 371 5 2
OnTouch2:
	moveto  "gef_fild09" 225 28
	return

warp "gef_fild09" "g09a-g10a" 225 25 3 2
OnTouch2:
	moveto  "gef_fild10" 251 368
	return

//Geffen 3-10,Geffen3-1

warp "gef_fild03" "g03b-g10b" 18 52 2 4
OnTouch2:
	moveto  "gef_fild10" 367 56
	return

warp "gef_fild10" "g10b-g03b" 370 56 2 5
OnTouch2:
	moveto  "gef_fild03" 21 52
	return

warp "gef_fild03" "g03c-g01c" 66 382 4 2
OnTouch2:
	moveto  "gef_fild01" 69 20
	return

warp "gef_fild01" "g01c-g03c" 69 17 4 2
OnTouch2:
	moveto  "gef_fild03" 66 379
	return

//Geffen 2-3

warp "gef_fild02" "g02e-g03e" 16 275 2 4
OnTouch2:
	moveto  "gef_fild03" 379 277
	return

warp "gef_fild03" "g03e-g02e" 382 277 2 4
OnTouch2:
	moveto  "gef_fild02" 19 275
	return

warp "gef_fild02" "g02d-g03d" 14 78 2 4
OnTouch2:
	moveto  "gef_fild03" 379 77
	return

warp "gef_fild03" "g03d-g02d" 382 77 2 4
OnTouch2:
	moveto  "gef_fild02" 17 78
	return

//Prontera 11-Geffen 3

warp "prt_fild11" "p11a-g03a" 302 301 5 2
OnTouch2:
	moveto  "gef_fild03" 312 19
	return

warp "gef_fild03" "g03a-p11a" 312 16 5 2
OnTouch2:
	moveto  "prt_fild11" 302 298
	return

//Prontera 10-11,Prontera 10-Geffen2

warp "prt_fild10" "p10d-p11d" 20 196 2 4
OnTouch2:
	moveto  "prt_fild11" 358 184
	return

warp "prt_fild11" "p11d-p10d" 361 184 2 5
OnTouch2:
	moveto  "prt_fild10" 23 196
	return

warp "prt_fild10" "p10c-p11c" 20 122 2 4
OnTouch2:
	moveto  "prt_fild11" 359 111
	return

warp "prt_fild11" "p11c-p10c" 362 111 2 6
OnTouch2:
	moveto  "prt_fild10" 23 122
	return

warp "prt_fild10" "p10a-g02a" 227 299 5 2
OnTouch2:
	moveto  "gef_fild02" 266 21
	return

warp "gef_fild02" "g02a-p10a" 266 18 5 2
OnTouch2:
	moveto  "prt_fild10" 227 296
	return

//Prontera 9-10,Prontera 9-7

warp "prt_fild09" "p09b-p10b" 14 139 2 8
OnTouch2:
	moveto  "prt_fild10" 336 126
	return

warp "prt_fild09" "p09b-p10b" 14 124 2 6
OnTouch2:
	moveto  "prt_fild10" 336 126
	return
		
warp "prt_fild10" "p10b-p09b" 339 126 2 8
OnTouch2:
	moveto  "prt_fild09" 17 133
	return

warp "prt_fild09" "p09g-p07g" 87 380 5 2
OnTouch2:
	moveto  "prt_fild07" 84 16
	return

warp "prt_fild07" "p07g-p09g" 84 13 4 2
OnTouch2:
	moveto  "prt_fild09" 87 377
	return

warp "prt_fild09" "p09h-p07h" 224 380 4 2
OnTouch2:
	moveto  "prt_fild07" 206 15
	return

warp "prt_fild07" "p07h-p09h" 206 12 4 2
OnTouch2:
	moveto  "prt_fild09" 224 377
	return

//Morroc 1-Prontera 9

warp "moc_fild01" "m01d-p09c" 22 242 2 2
OnTouch2:
	moveto  "prt_fild09" 380 237 
	return

warp "prt_fild09" "p09c-m01d" 383 223 2 15
OnTouch2:
	moveto  "moc_fild01" 25 242
	return

warp "prt_fild09" "p09c-m01d" 383 251 2 15
OnTouch2:
	moveto  "moc_fild01" 25 242
	return

//Payon 4-Morroc 1

warp "pay_fild04" "p04e-m01e" 17 165 2 8
OnTouch2:
	moveto  "moc_fild01" 376 162
	return

warp "moc_fild01" "m01e-p04e" 379 162 2 12
OnTouch2:
	moveto  "pay_fild04" 20 165
	return

//Morroc 2-Payon 4

warp "moc_fild02" "m02e-p04a" 350 339 6 2
OnTouch2:
	moveto  "pay_fild04" 194 20
	return

warp "pay_fild04" "p04a-m02e" 194 17 7 2
OnTouch2:
	moveto  "moc_fild02" 350 336
	return

//Morroc13-2

warp "moc_fild13" "m13c-m02c" 146 368 5 2
OnTouch2:
	moveto  "moc_fild02" 71 21
	return

warp "moc_fild02" "m02c-m13c" 71 18 4 2
OnTouch2:
	moveto  "moc_fild13" 146 365
	return

warp "moc_fild02" "m02d-m13d" 228 29 4 2
OnTouch2:
	moveto  "moc_fild13" 298 367
	return

warp "moc_fild13" "m13d-m02d" 298 370 4 2
OnTouch2:
	moveto  "moc_fild02" 228 32
	return
	
//Morroc 3-Morroc 13

warp "moc_fild03" "m03c-m13b" 17 37 2 4
OnTouch2:
	moveto  "moc_fild13" 305 49
	return

warp "moc_fild13" "m13b-m03c" 308 49 2 4
OnTouch2:
	moveto  "moc_fild03" 20 37
	return

//Payon 11-Morroc 3

//warp "pay_fild11" "p11d-m03d" 38 330 4 2
//OnTouch2:
//	moveto  "moc_fild03" 179 19
//	return

//warp "moc_fild03" "m03d-p11d" 179 16 4 2
//OnTouch2:
//	moveto  "pay_fild11" 38 327
//	return

//Payon 2-11

//warp "pay_fild02" "p02e-p11a" 16 175 2 4
//OnTouch2:
//	moveto  "pay_fild11" 294 135
//	return

//warp "pay_fild11" "p11a-p02e" 297 135 2 4
//OnTouch2:
//	moveto  "pay_fild02" 19 175
//	return

//Payon 5-2

//warp "pay_fild05" "p05d-p02d" 127 378 4 2
//OnTouch2:
//	moveto  "pay_fild02" 134 19
//	return

//warp "pay_fild02" "p02d-p05d" 134 16 5 2
//OnTouch2:
//	moveto  "pay_fild05" 127 375
//	return

//Payon 6-5,Payon 6-3

//warp "pay_fild06" "p06a-p05a" 28 288 2 2
//OnTouch2:
//	moveto  "pay_fild05" 268 284
//	return

//warp "pay_fild05" "p05a-p06a" 271 284 2 4
//OnTouch2:
//	moveto  "pay_fild06" 31 288
//	return

warp "pay_fild06" "p06c-p03c" 305 375 6 2
OnTouch2:
	moveto  "pay_fild03" 313 19
	return

warp "pay_fild03" "p03c-p06c" 313 16 4 2
OnTouch2:
	moveto  "pay_fild06" 305 372
	return

//Morroc 4-Prontera 9
/*
warp "moc_fild04" "m04d-p09d" 92 381 9 2
OnTouch2:
	moveto  "prt_fild09" 246 19
	return

warp "prt_fild09" "p09d-m04d" 246 16 7 2
OnTouch2:
	moveto  "moc_fild04" 92 378
	return
*/	
//Morroc 5-Prontera 10, Morroc 5-Prontera 9
/*
warp "moc_fild05" "m05a-p10e" 144 375 11 2
OnTouch2:
	moveto  "prt_fild10" 263 23
	return

warp "prt_fild10" "p10e-m05a" 263 20 6 2
OnTouch2:
	moveto  "moc_fild05" 144 372
	return

warp "moc_fild05" "m05b-p09e" 325 382 6 2
OnTouch2:
	moveto  "prt_fild09" 95 19
	return

warp "prt_fild09" "p09e-m05b" 95 16 7 2
OnTouch2:
	moveto  "moc_fild05" 325 379
	return
*/
//Morroc 19-ruins

warp "moc_fild19" "m19a-ruins" 71 170 8 2
OnTouch2:
	moveto  "moc_ruins" 71 19
	return

warp "moc_ruins" "ruins-m19a" 71 16 8 2
OnTouch2:
	moveto  "moc_fild19" 71 167
	return

//Morroc 10-6,Morroc 10-Morroc East
/*
warp "moc_fild10" "m10c-m06c" 208 298 10 2
OnTouch2:
	moveto  "moc_fild06" 207 21
	return

warp "moc_fild06" "m06c-m10c" 207 18 11 2
OnTouch2:
	moveto  "moc_fild10" 208 295
	return

warp "moc_fild10" "m10a-morocc" 19 207 2 2
OnTouch2:
	moveto  "morocc" 299 207
	return

warp "morocc" "morocc-m10a" 302 207 2 2
OnTouch2:
	moveto  "moc_fild10" 22 207
	return
*/
//Morroc 9-10,Morroc 9-5
/*
warp "moc_fild09" "m09d-m10d" 30 162 2 3
OnTouch2:
	moveto  "moc_fild10" 381 258 
	return

warp "moc_fild10" "m10d-m09d" 384 258 2 3
OnTouch2:
	moveto  "moc_fild09" 33 162
	return

warp "moc_fild09" "m09e-m05e" 80 369 7 2
OnTouch2:
	moveto  "moc_fild05" 82 19
	return

warp "moc_fild05" "m05e-m09e" 82 16 5 2
OnTouch2:
	moveto  "moc_fild09" 80 366
	return

warp "moc_fild09" "m09c-m05d" 267 371 4 2
OnTouch2:
	moveto  "moc_fild05" 268 21
	return

warp "moc_fild05" "m05d-m09c" 268 18 4 2
OnTouch2:
	moveto  "moc_fild09" 267 368
	return
*/
//Morroc 8-9,Morroc 8-4,Morroc 8-13
/*
warp "moc_fild08" "m08b-m09b" 16 207 2 4
OnTouch2:
	moveto  "moc_fild09" 371 195
	return

warp "moc_fild09" "m09b-m08b" 374 195 2 8
OnTouch2:
	moveto  "moc_fild08" 19 207
	return

warp "moc_fild08" "m08e-m04e" 170 383 3 2
OnTouch2:
	moveto  "moc_fild04" 175 21
	return

warp "moc_fild04" "m04e-m08e" 175 18 3 2
OnTouch2:
	moveto  "moc_fild08" 170 380
	return

warp "moc_fild08" "m08a-m13a" 383 211 2 4
OnTouch2:
	moveto  "moc_fild13" 32 171
	return

warp "moc_fild13" "m13a-m08a" 29 171 2 4
OnTouch2:
	moveto  "moc_fild08" 380 211
	return
*/
//Morroc 19-Morroc West

warp "moc_fild19" "West Field-moc" 169 107 1 4
OnTouch2:	
	moveto "morocc" 27 164
	return

warp "morocc" "moc-West Field" 24 164 1 2
OnTouch2:
	moveto "moc_fild19" 164 107
	return

//Morroc 12-Morroc South
warp "moc_fild12" "m12a-morocc" 159 381 2 2
OnTouch2:
	moveto  "morocc" 160 20
	return

warp "morocc" "morocc-m12a" 160 17 2 2
OnTouch2:
	moveto  "moc_fild12" 159 378
	return

//Morroc 11-12,Morroc 11-10

warp "moc_fild11" "m11b-m12b" 26 161 2 10
OnTouch2:
	moveto  "moc_fild12" 286 168
	return

warp "moc_fild12" "m12b-m11b" 289 168 2 3
OnTouch2:
	moveto  "moc_fild11" 29 161
	return
/*
warp "moc_fild11" "m11a-m10b" 189 363 3 2
OnTouch2:
	moveto  "moc_fild10" 189 26
	return

warp "moc_fild10" "m10b-m11a" 189 23 3 2
OnTouch2:
	moveto  "moc_fild11" 189 360
	return
*/
//Morroc 15-10(N/A),Morroc 15-11, Morroc 15-9
/*
warp "moc_fild15" "m15c-m11c" 38 105 2 4
OnTouch2:
	moveto  "moc_fild11" 376 197
	return

warp "moc_fild11" "m11c-m15c" 379 197 2 6
OnTouch2:
	moveto  "moc_fild15" 41 105
	return

warp "moc_fild15" "m15a-m09a" 158 363 6 2
OnTouch2:
	moveto  "moc_fild09" 126 23
	return

warp "moc_fild09" "m09a-m15a" 126 20 4 2
OnTouch2:
	moveto  "moc_fild15" 158 360
	return
*/
//Morroc 14-15,Morroc 14-8
/*
warp "moc_fild14" "m14b-m15b" 16 278 2 6
OnTouch2:
	moveto  "moc_fild15" 364 276
	return

warp "moc_fild15" "m15b-m14b" 367 276 2 4
OnTouch2:
	moveto  "moc_fild14" 19 278
	return

warp "moc_fild14" "m14c-m08c" 196 382 4 2
OnTouch2:
	moveto  "moc_fild08" 204 19
	return

warp "moc_fild08" "m08c-m14c" 204 16 4 2
OnTouch2:
	moveto  "moc_fild14" 196 379
	return
*/
//Morroc 18-12

warp "moc_fild18" "m18c-m12c" 158 382 4 2
OnTouch2:
	moveto  "moc_fild12" 118 33
	return

warp "moc_fild12" "m12c-m18c" 118 30 4 2
OnTouch2:
	moveto  "moc_fild18" 158 379
	return

//Morroc 17-18, Morroc 17-11
warp "moc_fild17" "m17a-m18a" 30 300 2 5
OnTouch2:
	moveto  "moc_fild18" 379 305
	return

warp "moc_fild18" "m18a-m17a" 382 305 2 4
OnTouch2:
	moveto  "moc_fild17" 33 300
	return

warp "moc_fild17" "m17d-m11d" 218 369 5 2
OnTouch2:
	moveto  "moc_fild11" 212 32
	return

warp "moc_fild11" "m11d-m17d" 212 29 4 2
OnTouch2:
	moveto  "moc_fild17" 218 366
	return

//Morroc16-17Morroc 16-15

warp "moc_fild16" "m16b-m17b" 16 179 2 6
OnTouch2:
	moveto  "moc_fild17" 366 272 2 3
	return

warp "moc_fild17" "m17b-m16b" 369 272 2 3
OnTouch2:
	moveto  "moc_fild16" 19 179
	return
/*
warp "moc_fild16" "m16d-m15d" 125 383 5 2
OnTouch2:
	moveto  "moc_fild15" 104 19
	return

warp "moc_fild15" "m15d-m16d" 104 16 9 2
OnTouch2:
	moveto  "moc_fild16" 125 380
	return

warp "moc_fild16" "m16e-m15e" 334 382 4 2
OnTouch2:
	moveto  "moc_fild15" 348 21
	return

warp "moc_fild15" "m15e-m16e" 348 18 5 2
OnTouch2:
	moveto  "moc_fild16" 334 379
	return
*/
//Payon 7-1,Payon 7-3

warp "pay_fild07" "p07e-p01e" 16 200 3 3
OnTouch2:
	moveto  "pay_fild01" 371 205
	return

warp "pay_fild01" "p01e-p07e" 379 201 2 6
OnTouch2:
	moveto  "pay_fild07" 23 207
	return

warp "pay_fild07" "p07d-p03d" 163 17 5 2
OnTouch2:
	moveto  "pay_fild03" 177 275
	return

warp "pay_fild03" "p03d-p07d" 172 281 5 2
OnTouch2:
	moveto  "pay_fild07" 167 20
	return

//Payon 10-7

warp "pay_fild10" "p10c-p07c" 16 290 2 5
OnTouch2:
	moveto  "pay_fild07" 379 290
	return

warp "pay_fild07" "p07c-p10c" 382 290 2 5
OnTouch2:
	moveto  "pay_fild10" 19 290
	return

//Payon 9-10

warp "pay_fild09" "p09a-p10a" 112 16 4 2
OnTouch2:
	moveto  "pay_fild10" 112 379
	return

warp "pay_fild10" "p10a-p09a" 112 382 3 2
OnTouch2:
	moveto  "pay_fild09" 112 19
	return
	
//Payon 8-9, Payon 8-Payon, Payon 8-7

warp "pay_fild08" "p08b-p09b" 262 91 2 4
OnTouch2:
	moveto  "pay_fild09" 19 91
	return

warp "pay_fild09" "p09b-p08b" 16 91 2 4
OnTouch2:
	moveto  "pay_fild08" 259 91
	return

//------------------------------------------------------------------------//
//  [2004-07-29 수정]
//-기존
//warp "pay_fild08" "p08-Town" 17 75 2 4
//OnTouch2:
//	moveto  "payon" 186 69
//	return
//
//warp "payon" "Town-p08" 189 69 2 4
//OnTouch2:
//	moveto  "pay_fild08" 20 74
//	return
//-수정
warp "pay_fild08" "p08-Town" 17 75 1 1
OnTouch2:
	moveto  "payon" 265 92
	return

warp "payon" "Town-p08" 267 89 1 1
OnTouch2:
	moveto  "pay_fild08" 20 74
	return
//------------------------------------------------------------------------//

warp "pay_fild08" "p08a-p07a" 160 16 4 2
OnTouch2:
	moveto  "pay_fild07" 280 379 4 2
	return

warp "pay_fild07" "p07a-p08a" 280 382 4 2
OnTouch2:
	moveto  "pay_fild08" 160 19
	return

//Mjolnir 12-5, Mjolnir 12-Aldebarn South

warp "mjolnir_12" "m12b-m05b" 220 26 3 2
OnTouch2:
	moveto  "mjolnir_05" 220 379
	return

warp "mjolnir_05" "m05b-m12b" 220 382 4 2
OnTouch2:
	moveto  "mjolnir_12" 220 29
	return
	
warp "mjolnir_12" "m12north-alde" 199 378 2 2
OnTouch2:
	moveto  "aldebaran" 138 37
	return

warp "aldebaran" "alde-m12north" 138 34 2 2
OnTouch2:
	moveto  "mjolnir_12" 199 375
	return
	
//Gef11 Field(Goblin)

warp "gef_fild11" "g11b-p11b" 377 293 2 4
OnTouch2:
	moveto  "prt_fild11" 20 281
	return

warp "prt_fild11" "p11b-g11b" 17 281 2 4
OnTouch2:
	moveto  "gef_fild11" 374 293
	return

warp "gef_fild11" "g11c-g10c" 111 364 6 3
OnTouch2:
	moveto  "gef_fild10" 104 24
	return

warp "gef_fild10" "g10c-g11c" 104 21 5 2
OnTouch2:
	moveto  "gef_fild11" 114 360
	return

//---------------------------------------------
//--------------- Dungeon-------------------

//------------- Geffen Dungeon


warp "gef_dun01" "Geffen Dungeon2-3" 197 38 2 1
OnTouch2:
	moveto  "gef_dun02" 106 132
	return

warp "gef_dun02" "Geffen Dungeon3-2" 106 134 2 1
OnTouch2:
	moveto  "gef_dun01" 197 40
	return

//------------- Iz Dungeon

warp "iz_dun02" "Iz Dungeon3-4" 339 331 2 2
OnTouch2:
	moveto  "iz_dun03" 32 63
	return

warp "iz_dun03" "Iz Dungeon4-3" 29 63 2 2
OnTouch2:
	moveto  "iz_dun02" 339 328
	return

warp "iz_dun03" "Iz Dungeon3-4" 264 245 1 2
OnTouch2:
	moveto  "iz_dun04" 26 27
	return

warp "iz_dun04" "Iz Dungeon4-3" 26 24 2 2
OnTouch2:
	moveto  "iz_dun03" 261 245
	return

//------------ Pyramids

warp "moc_prydb1" "prydb1-05" 100 55 2 1
OnTouch2:
	moveto  "moc_pryd05" 94 96
	return

warp "moc_pryd05" "pryd05-b1" 94 98 2 1
OnTouch2:
	moveto  "moc_prydb1" 100 57
	return

warp "moc_pryd05" "Pyramids5-6F" 223 9 2 2
OnTouch2:
	moveto  "moc_pryd06" 192 8
	return

warp "moc_pryd06" "Pyramids6-5F" 195 8 2 3
OnTouch2:
	moveto  "moc_pryd05" 220 9
	return

//------------- Payon cave

warp "pay_dun02" "Payon3-4F" 137 128 4 1
OnTouch2:
	moveto  "pay_dun03" 155 159
	return

warp "pay_dun03" "Payon4-3F" 155 161 2 1
OnTouch2:
	moveto  "pay_dun02" 137 126
	return

warp "pay_dun03" "Payon4-5F" 127 62 1 2
OnTouch2:
	var gil = rand 1 4
	if gil == 1
		moveto "pay_dun04" 43 40
	elseif gil == 2
		moveto "pay_dun04" 34 202
	elseif gil == 3
		moveto "pay_dun04" 201 204
	else
		moveto "pay_dun04" 189 43
	endif
	return

warp "pay_dun04" "Payon5-4Fa" 40 37 2 2
OnTouch2:
	moveto  "pay_dun03" 125 62
	return

warp "pay_dun04" "Payon5-4Fb" 32 204 2 1
OnTouch2:
	moveto  "pay_dun03" 125 62
	return

warp "pay_dun04" "Payon5-4Fc" 202 206 1 1
OnTouch2:
	moveto  "pay_dun03" 125 62
	return

warp "pay_dun04" "Payon 5-4Fd" 191 41 1 1
OnTouch2:
	moveto  "pay_dun03" 125 62
	return

//------------- Ant Hell-- Morroc4,15
/*
warp "moc_fild04" "moc4-anthell" 219 327 3 4
OnTouch2:
	setitem anthell 0
	moveto  "anthell01" 35 262
	return

warp "moc_fild15" "moc15-anthell" 258 253 3 3
OnTouch2:
	setitem anthell 1
	moveto  "anthell01" 35 262
	return
	
warp "anthell01" "Ant Hell-Outside" 35 267 1 1
OnTouch2:
	if v[anthell] == 0
	moveto  "moc_fild04" 213 327
	else
	moveto  "moc_fild15" 251 248
	endif
	return
*/
warp "anthell01" "ant1-2" 253 32 2 1
OnTouch2:
	moveto  "anthell02" 34 263
	return

warp "anthell02" "ant2-1" 32 267 2 2
OnTouch2:
	moveto  "anthell01" 253 35
	return
/*
warp "anthell02" "ant2-Outside" 171 169 1 2
OnTouch2:
	if v[anthell] == 0
	moveto  "moc_fild15" 251 248
	else
	moveto  "moc_fild04" 213 327
	endif
	return
*/
//---------------- Sphinx

warp "moc_fild19" "m19-sphinx1" 98 99 1 1
OnTouch2:
	moveto  "in_sphinx1" 288 9
	return

warp "in_sphinx1" "sphinx1-m19" 288 6 5 1
OnTouch2:
	moveto  "moc_fild19" 100 99
	return

warp "in_sphinx1" "sph1-sph2" 80 191 2 1
OnTouch2:
	moveto  "in_sphinx2" 149 81
	return

warp "in_sphinx2" "sph2-sph1" 149 77 3 2
OnTouch2:
	moveto  "in_sphinx1" 80 189
	return

warp "in_sphinx2" "sph2-3" 276 272 1 3
OnTouch2:
	moveto  "in_sphinx3" 210 54
	return

warp "in_sphinx3" "sph3-2" 210 57 4 1
OnTouch2:
	moveto  "in_sphinx2" 274 272
	return

warp "in_sphinx3" "sph3a-b" 70 83 4 1
OnTouch2:
	moveto  "in_sphinx3" 70 113
	return

warp "in_sphinx3" "sph3b-a" 70 111 1 1
OnTouch2:
	moveto  "in_sphinx3" 70 81
	return

warp "in_sphinx3" "sph3c-d" 60 227 1 4
OnTouch2:
	moveto  "in_sphinx3" 32 227
	return

warp "in_sphinx3" "sph3d-c" 35 227 2 4
OnTouch2:
	moveto  "in_sphinx3" 62 227
	return

warp "in_sphinx3" "sph3-sph4" 12 69 4 1
OnTouch2:
	moveto  "in_sphinx4" 10 222
	return

warp "in_sphinx4" "sph4-3" 10 224 2 1
OnTouch2:
	moveto  "in_sphinx3" 12 71
	return

warp "in_sphinx4" "sph4-5" 120 113 4 2
OnTouch2:	
	moveto  "in_sphinx5" 100 99
	return

warp "in_sphinx5" "sph5-4" 100 96 4 2
OnTouch2:
	moveto  "in_sphinx4" 120 116
	return

warp "in_sphinx5" "sph5" 11 183 3 1
OnTouch2:
	moveto  "in_sphinx5" 11 18
	return

warp "in_sphinx5" "sph5" 11 16 3 1
OnTouch2:
	moveto  "in_sphinx5" 189 181
	return
	
warp "in_sphinx5" "sph5" 189 183 3 1
OnTouch2:
	moveto  "in_sphinx5" 189 18
	return

warp "in_sphinx5" "sph5" 189 16 3 1
OnTouch2:
	moveto  "in_sphinx5" 11 181
	return 

warp "in_sphinx5" "sph5" 16 188 1 3
OnTouch2:
	moveto  "in_sphinx5" 181 188
	return

warp "in_sphinx5" "sph5" 183 188 1 3
OnTouch2:
	moveto  "in_sphinx5" 18 10
	return
	
warp "in_sphinx5" "sph5" 16 10 1 3
OnTouch2:
	moveto  "in_sphinx5" 181 10
	return

warp "in_sphinx5" "sph5" 183 10 1 3
OnTouch2:
	moveto  "in_sphinx5" 18 188
	return 

//-------------- 오크던전

warp "gef_fild10" "g10-in_orcs" 63 337 1 1
OnTouch2:
	moveto  "in_orcs01" 30 157
	return

warp "in_orcs01" "in_orcs-g10" 30 154 3 2
OnTouch2:
	moveto  "gef_fild10" 65 335
	return

warp "gef_fild10" "g10-in_orcs" 223 205 1 1
OnTouch2:
	moveto  "in_orcs01" 108 89
	return

warp "in_orcs01" "in_orcs-g10" 108 86 3 2
OnTouch2:
	moveto  "gef_fild10" 223 203
	return

warp "in_orcs01" "orcs-dun01" 30 182 2 1
OnTouch2:
	moveto  "orcsdun01" 32 170
	return

warp "orcsdun01" "dun01-orcs" 32 172 3 1
OnTouch2:
	moveto  "in_orcs01" 30 180
	return

warp "in_orcs01" "orcs-dun02" 108 114 2 1
OnTouch2:
	moveto  "orcsdun02" 180 17
	return

warp "orcsdun02" "dun02-orcs" 180 15 2 1
OnTouch2:
	moveto  "in_orcs01" 108 112
	return
	
warp "orcsdun02" "dun02-01" 21 188 8 2
OnTouch2:
	moveto  "orcsdun01" 183 11
	return

warp "orcsdun01" "dun01-02" 183 8 4 2
OnTouch2:
	moveto  "orcsdun02" 21 185
	return
	
warp "gef_fild10" "g10-orc_in" 136 331 1 1
OnTouch2:
	moveto  "in_orcs01" 122 171
	return

warp "in_orcs01" "orc_in-g10" 124 171 1 3
OnTouch2:
	moveto  "gef_fild10" 138 329
	return

warp "gef_fild10" "g10-orc_in" 138 284 1 1
OnTouch2:
	moveto  "in_orcs01" 29 114
	return

warp "in_orcs01" "orc_in-g10" 29 116 4 1
OnTouch2:
	moveto  "gef_fild10" 137 286
	return

warp "gef_fild10" "g10-orc_in" 215 51 1 1
OnTouch2:
	moveto  "in_orcs01" 162 53
	return

warp "in_orcs01" "orc_in-g10" 162 55 4 1
OnTouch2:
	moveto  "gef_fild10" 214 53
	return

//---------------- Dead Pit

warp "mjolnir_02" "m02-mdun" 79 365 2 1
OnTouch2:
	moveto  "mjo_dun01" 52 17
	return

warp "mjo_dun01" "mdun-m02" 52 14 4 2
OnTouch2:
	moveto  "mjolnir_02" 79 363
	return

warp "mjo_dun01" "mdun01-02" 14 283 2 4
OnTouch2:
	moveto  "mjo_dun02" 381 343
	return

warp "mjo_dun02" "mdun02-01" 384 343 2 4
OnTouch2:
	moveto  "mjo_dun01" 17 283
	return

warp "mjo_dun02" "mdun02-03" 31 21 1 1
OnTouch2:
	moveto  "mjo_dun03" 302 262
	return

warp "mjo_dun03" "mdun03-02" 302 264 1 1
OnTouch2:
	moveto  "mjo_dun02" 31 23
	return

warp "mjo_dun02" "mdun02-03" 39 21 1 1
OnTouch2:
	moveto  "mjo_dun03" 308 262
	return

warp "mjo_dun03" "mdun03-02" 308 264 1 1
OnTouch2:
	moveto  "mjo_dun02" 39 23
	return
	
//---- Prt_Monk

warp "prt_monk" "monkout-in" 245 137 1 1
OnTouch2:
	moveto  "monk_in" 98 183
	return

warp "monk_in" "monkin-out" 98 186 3 2
OnTouch2:
	moveto  "prt_monk" 245 139
	return

warp "prt_monk" "monkout-in" 245 106 1 1
OnTouch2:
	moveto  "monk_in" 98 30
	return

warp "monk_in" "monkin-out" 98 27 5 2
OnTouch2:
	moveto  "prt_monk" 245 104
	return

warp "monk_in" "monk_in" 69 84 1 3
OnTouch2:
	moveto  "monk_in" 38 92
	return

warp "monk_in" "monk_in" 40 92 1 3
OnTouch2:
	moveto  "monk_in" 71 84
	return
	
warp "monk_in" "monk_in" 69 46 1 3
OnTouch2:
	moveto  "monk_in" 38 38
	return

warp "monk_in" "monk_in" 40 38 1 3
OnTouch2:
	moveto  "monk_in" 71 46
	return
	
warp "monk_in" "monk_in" 128 46 1 3
OnTouch2:
	moveto  "monk_in" 161 38
	return

warp "monk_in" "monk_in" 159 38 1 3
OnTouch2:
	moveto  "monk_in" 126 46
	return
	
warp "monk_in" "monk_in" 128 84 1 3
OnTouch2:
	moveto  "monk_in" 161 90
	return

warp "monk_in" "monk_in" 159 90 1 3
OnTouch2:
	moveto  "monk_in" 126 84
	return

warp "monk_in" "monk_in" 99 141 3 1
OnTouch2:
	moveto  "monk_in" 99 100
	return

warp "monk_in" "monk_in" 99 102 5 1
OnTouch2:
	moveto  "monk_in" 99 143
	return
	
//------------------- Aldebaran Town

warp "aldebaran" "al-kapra" 61 229 1 1
OnTouch2:
	moveto  "aldeba_in" 148 227
	return

warp "aldeba_in" "al-kapra" 148 224 2 2
OnTouch2:
	moveto  "aldebaran" 63 227
	return

warp "aldebaran" "al-kapra" 51 218 1 1
OnTouch2:
	moveto  "aldeba_in" 24 227
	return

warp "aldeba_in" "al-kapra" 24 224 2 2
OnTouch2:
	moveto  "aldebaran" 53 216
	return

warp "aldeba_in" "al-kapra" 37 238 2 2
OnTouch2:
	moveto  "aldeba_in" 67 157
	return

warp "aldeba_in" "al-kapra" 64 157 2 2
OnTouch2:
	moveto  "aldeba_in" 34 238
	return

warp "aldeba_in" "al-kapra" 83 191 2 2
OnTouch2:
	moveto  "aldeba_in" 83 227
	return

warp "aldeba_in" "al-kapra" 83 224 2 2
OnTouch2:
	moveto  "aldeba_in" 83 188
	return

warp "aldeba_in" "al-kapra" 134 237 2 2
OnTouch2:
	moveto  "aldeba_in" 100 157
	return

warp "aldeba_in" "al-kapra" 103 157 2 2
OnTouch2:
	moveto  "aldeba_in" 137 237
	return

warp "aldebaran" "minga1" 89 234 1 1
OnTouch2:
	moveto  "aldeba_in" 242 237
	return

warp "aldeba_in" "minga1" 245 237 2 2
OnTouch2:
	moveto  "aldebaran" 91 234
	return

warp "aldebaran" "weapon" 72 197 1 1
OnTouch2:
	moveto  "aldeba_in" 27 37
	return

warp "aldeba_in" "weapon" 27 34 2 2
OnTouch2:
	moveto  "aldebaran" 72 195
	return

warp "aldeba_in" "weapon" 27 71 2 2
OnTouch2:
	moveto  "aldeba_in" 27 105
	return

warp "aldeba_in" "weapon" 27 102 2 2
OnTouch2:
	moveto  "aldeba_in" 27 68
	return

warp "aldebaran" "minga2" 118 63 1 1
OnTouch2:
	moveto  "aldeba_in" 211 117
	return

warp "aldeba_in" "minga2" 208 117 2 2
OnTouch2:
	moveto  "aldebaran" 116 63
	return

warp "aldeba_in" "minga2" 218 104 2 2
OnTouch2:
	moveto  "aldeba_in" 218 68
	return

warp "aldeba_in" "minga2" 217 71 2 2
OnTouch2:
	moveto  "aldeba_in" 218 107
	return

warp "aldeba_in" "minga2" 217 131 2 2
OnTouch2:
	moveto  "aldeba_in" 217 163
	return

warp "aldeba_in" "minga2" 217 160 2 2
OnTouch2:
	moveto  "aldeba_in" 217 128
	return

warp "aldebaran" "goods" 197 70 1 1
OnTouch2:
	moveto  "aldeba_in" 94 41
	return

warp "aldeba_in" "goods" 94 38 3 2
OnTouch2:
	moveto  "aldebaran" 197 68
	return

warp "aldeba_in" "goods" 103 61 2 2
OnTouch2:
	moveto  "aldeba_in" 97 105
	return

warp "aldeba_in" "goods" 97 102 2 2
OnTouch2:
	moveto  "aldeba_in" 103 58
	return

warp "aldebaran" "minga3" 225 54 1 1
OnTouch2:
	moveto  "aldeba_in" 149 120
	return

warp "aldeba_in" "minga3" 149 123 3 2
OnTouch2:
	moveto  "aldebaran" 223 56
	return

warp "aldeba_in" "minga3" 144 92 2 2
OnTouch2:
	moveto  "aldeba_in" 149 52
	return

warp "aldeba_in" "minga3" 149 55 2 2
OnTouch2:
	moveto  "aldeba_in" 144 95
	return

warp "aldebaran" "bar" 233 105 1 1
OnTouch2:
	moveto  "aldeba_in" 157 190
	return

warp "aldeba_in" "bar" 157 193 3 2
OnTouch2:
	moveto  "aldebaran" 231 107
	return
	
// Molnir 10 Field

warp "mjolnir_10" "m10-m11" 384 220 2 4
OnTouch2:
	moveto  "mjolnir_11"  23 220
	return

warp "mjolnir_11" "m11-m10" 20 220 2 4
OnTouch2:
	moveto  "mjolnir_10" 381 220
	return

warp "mjolnir_10" "m10-m05" 235 381 4 2
OnTouch2:
	moveto  "mjolnir_05" 235 19
	return

warp "mjolnir_05" "m05-m10" 235 16 4 2
OnTouch2:
	moveto  "mjolnir_10" 235 378
	return

warp "mjolnir_10" "m10-m08" 15 258 2 4
OnTouch2:
	moveto  "mjolnir_08" 366 257
	return

warp "mjolnir_08" "m08-m10" 369 257 2 4
OnTouch2:
	moveto  "mjolnir_10" 18 258
	return

warp "mjolnir_10" "m10-p01" 265 13 3 2
OnTouch2:
	moveto  "prt_fild01" 261 370
	return

warp "prt_fild01" "p01-m10" 261 373 6 2
OnTouch2:
	moveto  "mjolnir_10" 265 16
	return

warp "mjolnir_10" "m10-p01" 66 15 4 2
OnTouch2:
	moveto  "prt_fild01" 66 370
	return

warp "prt_fild01" "p01-m10" 66 373 2 2
OnTouch2:
	moveto  "mjolnir_10" 66 18
	return
	
warp "pay_fild10" "Outside the hunter guild" 99 13 1 1
OnTouch2:
	moveto "pay_fild10" 148 252
return
	
warp "prt_church" "RoomPi-RoomPo" 90 81 1 2
OnTouch2:
	moveto "prt_church" 27 19
return		
		
warp "prt_church" "RoomPo-RoomPi" 31 19 1 2
OnTouch2:
	moveto "prt_church" 94 81
return		
		
warp "prt_church" "RoomAi-RoomAo" 109 81 1 2
OnTouch2:
	moveto "prt_church" 172 19
return		
		
warp "prt_church" "RoomAo-RoomAi" 168 19 1 2
OnTouch2:
	moveto "prt_church" 105 81
return		

hiddenwarp "izlude_in" "sword_out" 63 165 1 1
OnTouch2:
	checkpoint "izlude_in" 68 165
	moveto "izlude_in" 68 165
return	
