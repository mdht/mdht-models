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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Vehicle</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehiclePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehiclePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehiclePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugVehicleOperations extends ParticipantRoleOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DrugVehicleOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehiclePlayingEntityCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntityCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.playingEntity.oclIsUndefined() implies self.playingEntity.code->size() =1";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehiclePlayingEntityCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntityCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.playingEntity.oclIsUndefined() implies self.playingEntity.code->size() =1
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehiclePlayingEntityCode(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_PLAYING_ENTITY_CODE,
					ConsolPlugin.INSTANCE.getString("DrugVehiclePlayingEntityCode"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehiclePlayingEntityName(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Name</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntityName(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.playingEntity.oclIsUndefined() implies self.playingEntity.name->size() =1";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehiclePlayingEntityName(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntityName(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.playingEntity.oclIsUndefined() implies self.playingEntity.name->size() =1
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehiclePlayingEntityName(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_PLAYING_ENTITY_NAME,
					ConsolPlugin.INSTANCE.getString("DrugVehiclePlayingEntityName"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehicleTemplateId(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleTemplateId(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.24')";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehicleTemplateId(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleTemplateId(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.24')
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehicleTemplateId(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("DrugVehicleTemplateId"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehicleClassCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleClassCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehicleClassCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleClassCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* isDefined('classCode')
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehicleClassCode(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("DrugVehicleClassCode"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehicleCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '412307009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehicleCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehicleCode(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	* value.code = '412307009' and value.codeSystem = '2.16.840.1.113883.6.96')
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehicleCode(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_CODE,
					ConsolPlugin.INSTANCE.getString("DrugVehicleCode"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDrugVehiclePlayingEntity(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntity(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(rim::Entity))";

	/**
	* The cached OCL invariant for the '{@link #validateDrugVehiclePlayingEntity(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Playing Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDrugVehiclePlayingEntity(DrugVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(rim::Entity))
	* @param drugVehicle The receiving '<em><b>Drug Vehicle</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateDrugVehiclePlayingEntity(DrugVehicle drugVehicle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DRUG_VEHICLE);
			try {
				VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DRUG_VEHICLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			drugVehicle)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DRUG_VEHICLE__DRUG_VEHICLE_PLAYING_ENTITY,
					ConsolPlugin.INSTANCE.getString("DrugVehiclePlayingEntity"), new Object[] { drugVehicle }));
			}

			return false;
		}
		return true;
	}

} // DrugVehicleOperations
