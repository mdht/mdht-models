/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.util.QrphValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection#validateRiskIndicatorsForHearingLossSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskIndicatorsForHearingLossSectionOperations extends SectionOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RiskIndicatorsForHearingLossSectionOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.15.3.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Indicators For Hearing Loss Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.15.3.1')
	 * @param riskIndicatorsForHearingLossSection The receiving '<em><b>Risk Indicators For Hearing Loss Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateRiskIndicatorsForHearingLossSectionTemplateId(RiskIndicatorsForHearingLossSection riskIndicatorsForHearingLossSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(QrphPackage.Literals.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION);
			try {
				VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(riskIndicatorsForHearingLossSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QrphValidator.DIAGNOSTIC_SOURCE,
						 QrphValidator.RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__RISK_INDICATORS_FOR_HEARING_LOSS_SECTION_TEMPLATE_ID,
						 QrphPlugin.INSTANCE.getString("RiskIndicatorsForHearingLossSectionTemplateId"),
						 new Object [] { riskIndicatorsForHearingLossSection }));
			}
			 
			return false;
		}
		return true;
	}

} // RiskIndicatorsForHearingLossSectionOperations