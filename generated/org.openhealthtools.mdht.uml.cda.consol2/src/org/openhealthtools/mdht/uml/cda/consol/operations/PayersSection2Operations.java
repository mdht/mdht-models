/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#getConsolCoverageActivity2s() <em>Get Consol Coverage Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2#validatePayersSectionCoverageActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Coverage Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayersSection2Operations extends PayersSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayersSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolCoverageActivity2s(PayersSection2) <em>Get Consol Coverage Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCoverageActivity2s(PayersSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CoverageActivity2)).oclAsType(consol::CoverageActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolCoverageActivity2s(PayersSection2) <em>Get Consol Coverage Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCoverageActivity2s(PayersSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CoverageActivity2> getConsolCoverageActivity2s(PayersSection2 payersSection2) {
		if (GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PAYERS_SECTION2,
				ConsolPackage.Literals.PAYERS_SECTION2.getEAllOperations().get(62));
			try {
				GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_COVERAGE_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CoverageActivity2> result = (Collection<CoverageActivity2>) query.evaluate(payersSection2);
		return new BasicEList.UnmodifiableEList<CoverageActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayersSectionTemplateId(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionTemplateId(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.18' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePayersSectionTemplateId(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionTemplateId(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param payersSection2 The receiving '<em><b>Payers Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePayersSectionTemplateId(PayersSection2 payersSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYERS_SECTION2);
			try {
				VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			payersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PAYERS_SECTION2__PAYERS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PayersSection2PayersSectionTemplateId"),
					new Object[] { payersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayersSectionCodeP(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCodeP(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayersSectionCodeP(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCodeP(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param payersSection2 The receiving '<em><b>Payers Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePayersSectionCodeP(PayersSection2 payersSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYERS_SECTION2);
			try {
				VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYERS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PAYERS_SECTION2__PAYERS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("PayersSection2PayersSectionCodeP"),
					new Object[] { payersSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PayersSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PayersSectionCodeP", passToken);
				}
				passToken.add(payersSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayersSectionCode(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCode(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePayersSectionCode(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCode(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param payersSection2 The receiving '<em><b>Payers Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePayersSectionCode(PayersSection2 payersSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PayersSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(payersSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYERS_SECTION2);
			try {
				VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PAYERS_SECTION2__PAYERS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("PayersSection2PayersSectionCode"), new Object[] { payersSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayersSectionCoverageActivity(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Coverage Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCoverageActivity(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::CoverageActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayersSectionCoverageActivity(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payers Section Coverage Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayersSectionCoverageActivity(PayersSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param payersSection2 The receiving '<em><b>Payers Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePayersSectionCoverageActivity(PayersSection2 payersSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYERS_SECTION2);
			try {
				VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYERS_SECTION_COVERAGE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			payersSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PAYERS_SECTION2__PAYERS_SECTION_COVERAGE_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("PayersSection2PayersSectionCoverageActivity"),
					new Object[] { payersSection2 }));
			}

			return false;
		}
		return true;
	}

} // PayersSection2Operations
