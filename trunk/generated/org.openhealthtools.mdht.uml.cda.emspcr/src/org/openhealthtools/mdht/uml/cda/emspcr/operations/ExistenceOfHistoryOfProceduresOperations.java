/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of History Of Procedures</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfHistoryOfProceduresOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfHistoryOfProceduresOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfProceduresTemplateId(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresTemplateId(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.142')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfProceduresTemplateId(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresTemplateId(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfProcedures The receiving '<em><b>Existence Of History Of Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfProceduresTemplateId(ExistenceOfHistoryOfProcedures existenceOfHistoryOfProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_PROCEDURES);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfHistoryOfProcedures)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_PROCEDURES__EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfProceduresTemplateId"),
						 new Object [] { existenceOfHistoryOfProcedures }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfProceduresCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67792-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfProceduresCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfProcedures The receiving '<em><b>Existence Of History Of Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfProceduresCode(ExistenceOfHistoryOfProcedures existenceOfHistoryOfProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_PROCEDURES);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfHistoryOfProcedures)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_PROCEDURES__EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfProceduresCode"),
						 new Object [] { existenceOfHistoryOfProcedures }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfProceduresValue(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresValue(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfProceduresValue(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresValue(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfProcedures The receiving '<em><b>Existence Of History Of Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfProceduresValue(ExistenceOfHistoryOfProcedures existenceOfHistoryOfProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_PROCEDURES);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfHistoryOfProcedures)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_PROCEDURES__EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfProceduresValue"),
						 new Object [] { existenceOfHistoryOfProcedures }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfProceduresMoodCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresMoodCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfProceduresMoodCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfProceduresMoodCode(ExistenceOfHistoryOfProcedures, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfProcedures The receiving '<em><b>Existence Of History Of Procedures</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfProceduresMoodCode(ExistenceOfHistoryOfProcedures existenceOfHistoryOfProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_PROCEDURES);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(existenceOfHistoryOfProcedures)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_PROCEDURES__EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfProceduresMoodCode"),
						 new Object [] { existenceOfHistoryOfProcedures }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfHistoryOfProceduresOperations