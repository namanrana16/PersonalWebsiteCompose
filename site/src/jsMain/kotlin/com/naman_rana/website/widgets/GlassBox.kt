package com.binayshaw7777.kotfolio.components.widgets

import androidx.compose.runtime.Composable
import com.naman_rana.website.utils.Res
import com.varabyte.kobweb.compose.css.CSSLengthNumericValue
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.opacity
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*

@Composable
fun GlassBox(
    modifier: Modifier = Modifier,
    roundedCorners: CSSLengthOrPercentageNumericValue = 10.px,
    borderWidth: CSSLengthNumericValue = 1.px,
    borderStyle: LineStyle = LineStyle.Solid,
   
   // borderColor: CSSColorValue = when (ColorMode.current) {
       // ColorMode.LIGHT -> Colors.Black
      //  ColorMode.DARK -> Colors.White
 //   },
    gradientDirection: LinearGradient.Direction = LinearGradient.Direction.ToBottomRight,
    startColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0),
    endColor: CSSColorValue = rgba(r = 255, g = 255, b = 255, a = 0.06),
    blendMode: MixBlendMode = MixBlendMode.Normal,
    content: @Composable BoxScope.() -> Unit
) {

    Box(
        modifier = Modifier.margin(leftRight = 1.cssRem).then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .margin(leftRight = 1.cssRem)
                .borderRadius(roundedCorners)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid
                )
                
                //.border(width = borderWidth, style = borderStyle, color = borderColor)
            
        )
        content()
    }
}