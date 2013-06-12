/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Mode To Scene</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseModeToSceneOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseModeToSceneOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.98')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneTemplateId(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneTemplateId"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneCodeP(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneCodeP"),
						 new Object [] { responseModeToScene }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP", passToken);
				}
				passToken.add(responseModeToScene);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67482-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneCode(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(responseModeToScene)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneCode"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17177-9' or value.code = 'LA17178-7' or value.code = 'LA17179-5' or value.code = 'LA17180-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneValue(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneValue"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneValueP(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneValueP"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeToSceneMoodCode(ResponseModeToScene responseModeToScene, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneMoodCode"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

} // ResponseModeToSceneOperations