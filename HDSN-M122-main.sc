#ifkeyboard BFBE		# IBM Model M-122
ifset set3			# IBM terminal protocol

remapblock
layer 0
	LANG_4 	 			LGUI	 	  	#Windows Key (Middle of + nav)
	EUROPE_2 			LGUI 			#Windows Key (Keybeside Left Shift) 
	#EUROPE_1 			A			# \| key beside ENTER

	# Terminal Side Keys F1 - F10
	EXTRA_F1 			MEDIA_CALCULATOR	#Calculator
	EXTRA_F2			ESC			#Escape
	EXTRA_F3			MEDIA_MY_COMPUTER	#MyComputer
	EXTRA_F4			PRINTSCREEN		#Printscreen
	EXTRA_F5			F24 			#Powershell
	EXTRA_F6			F20 			#Notepad
	EXTRA_F7			F22			#Task Manager
	# EXTRA_F8			A			
	# EXTRA_F9			A			
	EXTRA_F10			RGUI			#Windows Key

	# Terminal numpad Fix
	ESC				NUM_LOCK
	NUM_LOCK			PAD_SLASH
	SCROLL_LOCK			PAD_ASTERIX
	EXTRA_SYSRQ			PAD_MINUS
	PAD_ASTERIX			PAD_PLUS
	PAD_MINUS			PAD_PLUS
	PAD_PLUS			PAD_ENTER
	SELECT_3			ESC

	# Top-row F-keys
  	# F13				A
	F14				MEDIA_PLAY_PAUSE
	F15				MEDIA_MUTE
	F16				MEDIA_VOLUME_DOWN
	F17				MEDIA_VOLUME_UP
	F18				MEDIA_PREV_TRACK
	F19				MEDIA_NEXT_TRACK
	# F20				A 
	# F21 				A 
	# F22 				PRINTSCREEN
	F23				SCROLL_LOCK
	# F24 				A
endblock
