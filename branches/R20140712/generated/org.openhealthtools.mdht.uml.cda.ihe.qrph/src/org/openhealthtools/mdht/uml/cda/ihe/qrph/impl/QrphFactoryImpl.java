/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QrphFactoryImpl extends EFactoryImpl implements QrphFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static QrphFactory init()
  {
		try {
			QrphFactory theQrphFactory = (QrphFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe/qrph"); 
			if (theQrphFactory != null) {
				return theQrphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QrphFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QrphFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case QrphPackage.EARLY_HEARING_CARE_PLAN_DOCUMENT: return createEarlyHearingCarePlanDocument();
			case QrphPackage.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION: return createRiskIndicatorsForHearingLossSection();
			case QrphPackage.HEARING_SCREENING_CODED_RESULTS_SECTION: return createHearingScreeningCodedResultsSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarlyHearingCarePlanDocument createEarlyHearingCarePlanDocument()
  {
		EarlyHearingCarePlanDocumentImpl earlyHearingCarePlanDocument = new EarlyHearingCarePlanDocumentImpl();
		return earlyHearingCarePlanDocument;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RiskIndicatorsForHearingLossSection createRiskIndicatorsForHearingLossSection()
  {
		RiskIndicatorsForHearingLossSectionImpl riskIndicatorsForHearingLossSection = new RiskIndicatorsForHearingLossSectionImpl();
		return riskIndicatorsForHearingLossSection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HearingScreeningCodedResultsSection createHearingScreeningCodedResultsSection()
  {
		HearingScreeningCodedResultsSectionImpl hearingScreeningCodedResultsSection = new HearingScreeningCodedResultsSectionImpl();
		return hearingScreeningCodedResultsSection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public QrphPackage getQrphPackage()
  {
		return (QrphPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static QrphPackage getPackage()
  {
		return QrphPackage.eINSTANCE;
	}

} //QrphFactoryImpl
