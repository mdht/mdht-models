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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizer2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizer2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#getConsolFamilyHistoryObservation2s() <em>Get Consol Family History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizer2Operations extends FamilyHistoryOrganizerOperations {
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
	protected FamilyHistoryOrganizer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizer2TemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2TemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.45' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizer2TemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2TemplateId(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryOrganizer2TemplateId(FamilyHistoryOrganizer2 familyHistoryOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizer2FamilyHistoryOrganizer2TemplateId"),
						new Object[] { familyHistoryOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryOrganizer2Id(FamilyHistoryOrganizer2 familyHistoryOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER2_ID,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizer2FamilyHistoryOrganizer2Id"),
						new Object[] { familyHistoryOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolFamilyHistoryObservation2s(FamilyHistoryOrganizer2) <em>Get Consol Family History Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFamilyHistoryObservation2s(FamilyHistoryOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation2)).oclAsType(consol::FamilyHistoryObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolFamilyHistoryObservation2s(FamilyHistoryOrganizer2) <em>Get Consol Family History Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFamilyHistoryObservation2s(FamilyHistoryOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FamilyHistoryObservation2> getConsolFamilyHistoryObservation2s(
			FamilyHistoryOrganizer2 familyHistoryOrganizer2) {

		if (GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2,
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2.getEAllOperations().get(73));
			try {
				GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_FAMILY_HISTORY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryObservation2> result = (Collection<FamilyHistoryObservation2>) query.evaluate(
			familyHistoryOrganizer2);
		return new BasicEList.UnmodifiableEList<FamilyHistoryObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistoryOrganizer2 The receiving '<em><b>Family History Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(
			FamilyHistoryOrganizer2 familyHistoryOrganizer2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER2);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistoryOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER2__FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"FamilyHistoryOrganizer2FamilyHistoryOrganizerFamilyHistoryObservation"),
						new Object[] { familyHistoryOrganizer2 }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistoryOrganizer2Operations
