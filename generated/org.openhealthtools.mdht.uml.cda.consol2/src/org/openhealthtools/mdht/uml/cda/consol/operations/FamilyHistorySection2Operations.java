/**
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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#getConsolFamilyHistoryOrganizer2s() <em>Get Consol Family History Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySection2Operations extends FamilyHistorySectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySection2TemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2TemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.15' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySection2TemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySection2TemplateId(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySection2 The receiving '<em><b>Family History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySection2TemplateId(FamilyHistorySection2 familyHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SECTION2);
			try {
				VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_SECTION2__FAMILY_HISTORY_SECTION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("FamilyHistorySection2FamilyHistorySection2TemplateId"),
						new Object[] { familyHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolFamilyHistoryOrganizer2s(FamilyHistorySection2) <em>Get Consol Family History Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFamilyHistoryOrganizer2s(FamilyHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2)).oclAsType(consol::FamilyHistoryOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getConsolFamilyHistoryOrganizer2s(FamilyHistorySection2) <em>Get Consol Family History Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFamilyHistoryOrganizer2s(FamilyHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FamilyHistoryOrganizer2> getConsolFamilyHistoryOrganizer2s(
			FamilyHistorySection2 familyHistorySection2) {

		if (GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FAMILY_HISTORY_SECTION2,
				ConsolPackage.Literals.FAMILY_HISTORY_SECTION2.getEAllOperations().get(63));
			try {
				GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_FAMILY_HISTORY_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryOrganizer2> result = (Collection<FamilyHistoryOrganizer2>) query.evaluate(
			familyHistorySection2);
		return new BasicEList.UnmodifiableEList<FamilyHistoryOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionFamilyHistory(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionFamilyHistory(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FamilyHistoryOrganizer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionFamilyHistory(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionFamilyHistory(FamilyHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySection2 The receiving '<em><b>Family History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionFamilyHistory(FamilyHistorySection2 familyHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SECTION2);
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_SECTION2__FAMILY_HISTORY_SECTION_FAMILY_HISTORY,
						ConsolPlugin.INSTANCE.getString("FamilyHistorySection2FamilyHistorySectionFamilyHistory"),
						new Object[] { familyHistorySection2 }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistorySection2Operations
