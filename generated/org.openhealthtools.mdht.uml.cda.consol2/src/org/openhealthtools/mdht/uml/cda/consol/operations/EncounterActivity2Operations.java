/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolEncounterDiagnosis2s() <em>Get Consol Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolServiceDeliveryLocations() <em>Get Consol Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterActivity2Operations extends EncounterActivitiesOperations {
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
	protected EncounterActivity2Operations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesCodeP(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_CODE_P,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesCodeP"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEncounterActivity2CDTranslation(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			encounterActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITY2_CD_TRANSLATION,
							ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivity2CDTranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
			EncounterActivity2 encounterActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			encounterActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"EncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getConsolIndication2s(EncounterActivity2 encounterActivity2) {

		if (GET_CONSOL_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2,
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2.getEAllOperations().get(76));
			try {
				GET_CONSOL_INDICATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(encounterActivity2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EncounterDiagnosis2> getConsolEncounterDiagnosis2s(EncounterActivity2 encounterActivity2) {

		if (GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2,
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2.getEAllOperations().get(77));
			try {
				GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterDiagnosis2> result = (Collection<EncounterDiagnosis2>) query.evaluate(encounterActivity2);
		return new BasicEList.UnmodifiableEList<EncounterDiagnosis2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ServiceDeliveryLocation> getConsolServiceDeliveryLocations(
			EncounterActivity2 encounterActivity2) {

		if (GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2,
				ConsolPackage.Literals.ENCOUNTER_ACTIVITY2.getEAllOperations().get(78));
			try {
				GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY = helper.createQuery(
					GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ServiceDeliveryLocation> result = (Collection<ServiceDeliveryLocation>) query.evaluate(
			encounterActivity2);
		return new BasicEList.UnmodifiableEList<ServiceDeliveryLocation>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesSdtcDDCFromNUBCOrDD(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesSdtcDDCFromNUBCOrDD"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesTemplateId(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesTemplateId"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivity2CDTranslation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 CD Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivity2CDTranslation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (( not translation->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivity2CDTranslation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 CD Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivity2CDTranslation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * The cached OCL expression body for the '{@link #getConsolIndication2s(EncounterActivity2) <em>Get Consol Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getConsolIndication2s(EncounterActivity2) <em>Get Consol Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolIndication2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_INDICATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolEncounterDiagnosis2s(EncounterActivity2) <em>Get Consol Encounter Diagnosis2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterDiagnosis2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EncounterDiagnosis2)).oclAsType(consol::EncounterDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getConsolEncounterDiagnosis2s(EncounterActivity2) <em>Get Consol Encounter Diagnosis2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterDiagnosis2s(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ENCOUNTER_DIAGNOSIS2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolServiceDeliveryLocations(EncounterActivity2) <em>Get Consol Service Delivery Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolServiceDeliveryLocations(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ServiceDeliveryLocation)).oclAsType(consol::ServiceDeliveryLocation)";

	/**
	 * The cached OCL query for the '{@link #getConsolServiceDeliveryLocations(EncounterActivity2) <em>Get Consol Service Delivery Locations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolServiceDeliveryLocations(EncounterActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_SERVICE_DELIVERY_LOCATIONS__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesSdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (self.sDTCDischargeDispositionCode->forAll( element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and let value : datatypes::CE = element.oclAsType(datatypes::CE) in (value.codeSystem = '2.16.840.1.113883.6.301.5' or value.codeSystem = '2.16.840.1.113883.12.112') and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesSdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSdtcDDCFromNUBCOrDD(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.49' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesTemplateId(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.12' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesCode(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_CODE,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesCode"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.sDTCDischargeDispositionCode->isEmpty() or self.sDTCDischargeDispositionCode->exists(element | element.isNullFlavorUndefined())) implies (not self.sDTCDischargeDispositionCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesSDTCDischargeDispositionCode(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"EncounterActivity2EncounterActivitiesSDTCDischargeDispositionCode"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesIndication(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesIndication(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesIndication(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesIndication(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesIndication(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_INDICATION,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesIndication"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterDiagnosis(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterDiagnosis(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EncounterDiagnosis2))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterDiagnosis(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterDiagnosis(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesEncounterDiagnosis(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesEncounterDiagnosis"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesServiceDeliveryLocation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesServiceDeliveryLocation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::ServiceDeliveryLocation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesServiceDeliveryLocation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesServiceDeliveryLocation(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesServiceDeliveryLocation(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesServiceDeliveryLocation"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterPerformer(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformer(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterPerformer(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformer(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesEncounterPerformer(EncounterActivity2 encounterActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounterActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER,
						ConsolPlugin.INSTANCE.getString("EncounterActivity2EncounterActivitiesEncounterPerformer"),
						new Object[] { encounterActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
			EncounterActivity2 encounterActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			encounterActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"EncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(EncounterActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterActivity2 The receiving '<em><b>Encounter Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
			EncounterActivity2 encounterActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			encounterActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ENCOUNTER_ACTIVITY2__ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"EncounterActivity2EncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // EncounterActivity2Operations
