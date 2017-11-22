import { platformBrowser } from '@angular/platform-browser';
import { ProdConfig } from './blocks/config/prod.config';
import { TennisCourtAppModuleNgFactory } from '../../../../build/aot/src/main/webapp/app/app.module.ngfactory';

ProdConfig();

platformBrowser().bootstrapModuleFactory(TennisCourtAppModuleNgFactory)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
