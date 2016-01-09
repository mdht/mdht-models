using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Nehta.HL7.CDA;
using Nehta.VendorLibrary.Common;

namespace facade.consol
{
    public class SampleGenerator
    {

        public static facade.consol.DiagnosticImagingReportFacade GetSample()
        {

            facade.consol.DiagnosticImagingReportFacade doc = new facade.consol.DiagnosticImagingReportFacade();

            doc.Init();


            return doc;

      }


    }
}
