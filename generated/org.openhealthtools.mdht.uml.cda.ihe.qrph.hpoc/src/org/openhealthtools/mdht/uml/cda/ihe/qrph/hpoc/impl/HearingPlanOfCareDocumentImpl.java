/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingPlanOfCareDocumentImpl extends HearingPlanOfCareHeaderImpl implements HearingPlanOfCareDocument
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingPlanOfCareDocumentImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentTypeIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentTypeIdRoot(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentTypeIdExtension(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentSetIdAndVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentSetIdAndVersionNumber(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentRealmCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentRealmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentRealmCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentTypeId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentTitle(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentEffectiveTime(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentConfidentialityCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentLanguageCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentSetId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentSetId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentVersionNumber(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentHearingPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentHearingPlanOfCareSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentHearingScreeningSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentHearingScreeningSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentProblemsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentProblemsSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingPlanOfCareDocumentProcedureSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareDocumentProcedureSection(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HearingPlanOfCareSection getHearingPlanOfCareSection()
  {
		return HearingPlanOfCareDocumentOperations.getHearingPlanOfCareSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HearingScreeningSection getHearingScreeningSection()
  {
		return HearingPlanOfCareDocumentOperations.getHearingScreeningSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RiskIndicatorsForHearingLossSection getRiskIndicatorsForHearingLossSection()
  {
		return HearingPlanOfCareDocumentOperations.getRiskIndicatorsForHearingLossSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemsSection getProblemsSection()
  {
		return HearingPlanOfCareDocumentOperations.getProblemsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProcedureSection getProcedureSection()
  {
		return HearingPlanOfCareDocumentOperations.getProcedureSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateHearingPlanOfCareHeaderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingPlanOfCareDocumentOperations.validateHearingPlanOfCareHeaderTemplateId(this, diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingPlanOfCareDocument init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareDocumentImpl
