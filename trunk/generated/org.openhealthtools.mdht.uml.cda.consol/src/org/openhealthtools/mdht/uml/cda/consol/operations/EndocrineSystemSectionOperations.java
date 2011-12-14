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
import org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Endocrine System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection#validateEndocrineSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection#validateEndocrineSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndocrineSystemSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndocrineSystemSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEndocrineSystemSectionCode(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEndocrineSystemSectionCode(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '29307-6' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEndocrineSystemSectionCode(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEndocrineSystemSectionCode(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '29307-6' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param endocrineSystemSection The receiving '<em><b>Endocrine System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEndocrineSystemSectionCode(EndocrineSystemSection endocrineSystemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENDOCRINE_SYSTEM_SECTION);
			try {
				VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			endocrineSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENDOCRINE_SYSTEM_SECTION__ENDOCRINE_SYSTEM_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("EndocrineSystemSectionCode"),
					new Object[] { endocrineSystemSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEndocrineSystemSectionProblemEntry(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEndocrineSystemSectionProblemEntry(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEndocrineSystemSectionProblemEntry(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEndocrineSystemSectionProblemEntry(EndocrineSystemSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))
	 * @param endocrineSystemSection The receiving '<em><b>Endocrine System Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEndocrineSystemSectionProblemEntry(EndocrineSystemSection endocrineSystemSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENDOCRINE_SYSTEM_SECTION);
			try {
				VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			endocrineSystemSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENDOCRINE_SYSTEM_SECTION__ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY,
					ConsolPlugin.INSTANCE.getString("EndocrineSystemSectionProblemEntry"),
					new Object[] { endocrineSystemSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(EndocrineSystemSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(EndocrineSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(EndocrineSystemSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(EndocrineSystemSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation))->asSequence()->first().oclAsType(consol::AllergyObservation)
	 * @param endocrineSystemSection The receiving '<em><b>Endocrine System Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergyObservation getProblemEntry(EndocrineSystemSection endocrineSystemSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENDOCRINE_SYSTEM_SECTION,
				ConsolPackage.Literals.ENDOCRINE_SYSTEM_SECTION.getEAllOperations().get(57));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (AllergyObservation) query.evaluate(endocrineSystemSection);
	}

} // EndocrineSystemSectionOperations
