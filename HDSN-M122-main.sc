#ifkeyboard BFBE		# IBM Model M-122
ifset set3			# IBM terminal protocol

remapblock
layer 0
	LANG_4 	 			RGUI	 	  	#Windows Key (Middle of + nav)
	EUROPE_2 			LGUI 			#Windows Key (Keybeside Left Shift) 
	#EUROPE_1 			A			# \| key beside ENTER

	# Terminal Side Keys F1 - F10
	EXTRA_F1 			F21
	EXTRA_F2			ESC			#
	EXTRA_F3			F13			# 
	EXTRA_F4			F14			#
	EXTRA_F5			F15 			#
	EXTRA_F6			F16 			#
	EXTRA_F7			F17			#
	EXTRA_F8			F18			
	EXTRA_F9			F19			
	EXTRA_F10			F20			#

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
  	F13				MEDIA_PLAY_PAUSE
	F14				MEDIA_MUTE
	F15				MEDIA_VOLUME_DOWN
	F16				MEDIA_VOLUME_UP
	F17				MEDIA_PREV_TRACK
	F18				MEDIA_NEXT_TRACK
	F19				MEDIA_MY_COMPUTER
	F20				MEDIA_WWW_HOME
	# F21 				
	# F22 				
	# F23				
	F24 				PRINTSCREEN		
endblock


