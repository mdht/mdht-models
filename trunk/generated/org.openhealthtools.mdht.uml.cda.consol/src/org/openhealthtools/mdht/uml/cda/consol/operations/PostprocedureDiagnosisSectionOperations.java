/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection#getPostprocedureDiagnosis() <em>Get Postprocedure Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostprocedureDiagnosisSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.36')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.36')
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePostprocedureDiagnosisSectionTemplateId(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSectionTemplateId"),
					new Object[] { postprocedureDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '59769-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '59769-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePostprocedureDiagnosisSectionCode(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSectionCode"),
					new Object[] { postprocedureDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionText(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionText(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionText(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionText(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePostprocedureDiagnosisSectionText(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSectionText"),
					new Object[] { postprocedureDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionTitle(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTitle(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionTitle(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTitle(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePostprocedureDiagnosisSectionTitle(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSectionTitle"),
					new Object[] { postprocedureDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Postprocedure Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(PostprocedureDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePostprocedureDiagnosisSectionPostprocedureDiagnosis(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			postprocedureDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION__POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS,
					ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSectionPostprocedureDiagnosis"),
					new Object[] { postprocedureDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPostprocedureDiagnosis(PostprocedureDiagnosisSection) <em>Get Postprocedure Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis(PostprocedureDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSTPROCEDURE_DIAGNOSIS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->first().oclAsType(consol::PostprocedureDiagnosis)";

	/**
	 * The cached OCL query for the '{@link #getPostprocedureDiagnosis(PostprocedureDiagnosisSection) <em>Get Postprocedure Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostprocedureDiagnosis(PostprocedureDiagnosisSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->first().oclAsType(consol::PostprocedureDiagnosis)
	 * @param postprocedureDiagnosisSection The receiving '<em><b>Postprocedure Diagnosis Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PostprocedureDiagnosis getPostprocedureDiagnosis(
			PostprocedureDiagnosisSection postprocedureDiagnosisSection) {
		if (GET_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION,
				ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION.getEAllOperations().get(60));
			try {
				GET_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_POSTPROCEDURE_DIAGNOSIS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTPROCEDURE_DIAGNOSIS__EOCL_QRY);
		return (PostprocedureDiagnosis) query.evaluate(postprocedureDiagnosisSection);
	}

} // PostprocedureDiagnosisSectionOperations
