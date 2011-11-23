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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EarsSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ears Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EarsSection#validateEarsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EarsSection#validateEarsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EarsSection#validateEarsSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EarsSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEarsSectionTemplateId(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionTemplateId(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateEarsSectionTemplateId(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionTemplateId(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.21')
	 * @param earsSection The receiving '<em><b>Ears Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEarsSectionTemplateId(EarsSection earsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EARS_SECTION);
			try {
				VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.EARS_SECTION__EARS_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("EarsSectionTemplateId"),
						 new Object [] { earsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEarsSectionCode(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionCode(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10195-6' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEarsSectionCode(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionCode(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10195-6' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param earsSection The receiving '<em><b>Ears Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEarsSectionCode(EarsSection earsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EARS_SECTION);
			try {
				VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.EARS_SECTION__EARS_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("EarsSectionCode"),
						 new Object [] { earsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEarsSectionProblemEntry(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionProblemEntry(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEarsSectionProblemEntry(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEarsSectionProblemEntry(EarsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))
	 * @param earsSection The receiving '<em><b>Ears Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEarsSectionProblemEntry(EarsSection earsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EARS_SECTION);
			try {
				VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EARS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(earsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.EARS_SECTION__EARS_SECTION_PROBLEM_ENTRY,
						 ConsolPlugin.INSTANCE.getString("EarsSectionProblemEntry"),
						 new Object [] { earsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(EarsSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(EarsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(EarsSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(EarsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)
	 * @param earsSection The receiving '<em><b>Ears Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AllergyObservation getProblemEntry(EarsSection earsSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.EARS_SECTION, ConsolPackage.Literals.EARS_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (AllergyObservation) query.evaluate(earsSection);
	}

} // EarsSectionOperations