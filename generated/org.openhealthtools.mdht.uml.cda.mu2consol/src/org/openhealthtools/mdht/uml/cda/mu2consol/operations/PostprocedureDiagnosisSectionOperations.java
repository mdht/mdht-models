/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Postprocedure Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#getMu2consolPostprocedureDiagnosis() <em>Get Mu2consol Postprocedure Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostprocedureDiagnosisSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))
	 * 
	 * @param postprocedureDiagnosisSection
	 *            The receiving '<em><b>Postprocedure Diagnosis Section</b></em>
	 *            ' model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__MU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis"),
						 new Object [] { postprocedureDiagnosisSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolPostprocedureDiagnosis(PostprocedureDiagnosisSection) <em>Get Mu2consol Postprocedure Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolPostprocedureDiagnosis(PostprocedureDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosis)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolPostprocedureDiagnosis(PostprocedureDiagnosisSection) <em>Get Mu2consol Postprocedure Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolPostprocedureDiagnosis(PostprocedureDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosis)
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PostprocedureDiagnosis getMu2consolPostprocedureDiagnosis(PostprocedureDiagnosisSection postprocedureDiagnosisSection) {
		if (GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION, Mu2consolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION.getEAllOperations().get(63));
			try {
				GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY);
		return (PostprocedureDiagnosis) query.evaluate(postprocedureDiagnosisSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.36')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.36')
	 * 
	 * @param postprocedureDiagnosisSection
	 *            The receiving '<em><b>Postprocedure Diagnosis Section</b></em>
	 *            ' model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisSectionTemplateId(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PostprocedureDiagnosisSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(postprocedureDiagnosisSection, context) }),
						 new Object [] { postprocedureDiagnosisSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PostprocedureDiagnosisSectionOperations