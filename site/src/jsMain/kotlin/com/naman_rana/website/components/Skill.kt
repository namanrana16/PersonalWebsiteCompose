package com.naman_rana.website.components



import androidx.compose.runtime.Composable
import com.binayshaw7777.kotfolio.components.styles.ExperienceStyle
import com.binayshaw7777.kotfolio.components.widgets.GlassBox
import com.naman_rana.website.styles.SocialIconStyle
import com.naman_rana.website.utils.Res
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

@Composable

fun IconTextSurface() {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        
        Row(modifier = Modifier.fillMaxWidth().margin(top = 2.px)) {
            
                GlassBox(
                    modifier = Modifier.size(65.px)
                        .margin(all = 0.6.px)
                ) {
                    Image(
                        src = Res.Skills.KOTLIN,
                        modifier = SocialIconStyle.toModifier().size(42.px)
                            .styleModifier {
                                mixBlendMode(MixBlendMode.Normal)
                            }
                    )
                }
                GlassBox(
                    modifier = Modifier.size(65.px)
                        .margin(all = 0.6.px)

                ) {
                    Image(
                        src = Res.Skills.JAVA,
                        modifier = SocialIconStyle.toModifier().size(42.px)
                    )
                }
            
            GlassBox(
                modifier = Modifier.size(65.px)
                    .margin(all = 0.6.px)

            ) {
                Image(
                    src = Res.Skills.ANDROID,
                    modifier = SocialIconStyle.toModifier().size(42.px)
                )
            }
            
            GlassBox(
                modifier = Modifier.size(65.px)
                    .margin(all = 0.6.px)

            ) {
                Image(
                    src = Res.Skills.CPP,
                    modifier = SocialIconStyle.toModifier().size(42.px)
                )
            }
              
            }
            
        }
    }
