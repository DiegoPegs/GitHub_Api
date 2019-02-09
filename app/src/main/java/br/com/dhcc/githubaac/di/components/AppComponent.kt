package br.com.dhcc.githubaac.di.components

import android.app.Application
import br.com.dhcc.githubaac.MyApp
import br.com.dhcc.githubaac.di.modules.ActivityModule
import br.com.dhcc.githubaac.di.modules.AppModule
import br.com.dhcc.githubaac.di.modules.FragmentModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidInjectionModule::class,
            ActivityModule::class,
            FragmentModule::class,
            AppModule::class
        ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(applicatin: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApp)

}