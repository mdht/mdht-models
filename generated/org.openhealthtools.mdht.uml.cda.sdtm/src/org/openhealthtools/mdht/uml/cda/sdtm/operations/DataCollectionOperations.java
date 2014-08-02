/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Data Collection</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataCollectionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCollectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionTemplateId(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionTemplateId(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionTemplateId(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionTemplateId(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionTemplateId(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionClassCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionClassCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionClassCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionClassCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionClassCode(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionMoodCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionMoodCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionMoodCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionMoodCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionMoodCode(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionCodeP(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCodeP(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionCodeP(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCodeP(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionCodeP(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'DCtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCode(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionCode(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionCodeVS(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code VS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCodeVS(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C25150' or value.code = 'ATPtbd' or value.code = 'C49562' or value.code = 'AQtbd' or value.code = 'CEtbd' or value.code = 'C49569' or value.code = 'C83199' or value.code = 'CStbd' or value.code = 'C88026' or value.code = 'DCtbd' or value.code = 'DOtbd' or value.code = 'C95087' or value.code = 'DRtbd' or value.code = 'DMGtbd' or value.code = 'C66734' or value.code = 'DARtbd' or value.code = 'ELOtbd' or value.code = 'EDtbd' or value.code = 'C66769' or value.code = 'C49489' or value.code = 'C83208' or value.code = 'ESDtbd' or value.code = 'EXCtbd' or value.code = 'FStbd' or value.code = 'FAOtbd' or value.code = 'C83204' or value.code = 'HUStbd' or value.code = 'C83085' or value.code = 'IRtbd' or value.code = 'C87881' or value.code = 'MAStbd' or value.code = 'MHItbd' or value.code = 'NHStbd' or value.code = 'NPRtbd' or value.code = 'NSTtbd' or value.code = 'OWAtbd' or value.code = 'OATtbd' or value.code = 'C83450' or value.code = 'POTtbd' or value.code = 'C71148' or value.code = 'PSEtbd' or value.code = 'PDtbd' or value.code = 'RPtbd' or value.code = 'RRtbd' or value.code = 'C78736' or value.code = 'SETtbd' or value.code = 'C53252' or value.code = 'SETtbd' or value.code = 'SPCtbd' or value.code = 'SCLtbd' or value.code = 'C78733' or value.code = 'C78734' or value.code = 'SUtbd' or value.code = 'STRPtbd' or value.code = 'ENRPtbd' or value.code = 'SStbd' or value.code = 'STPtbd' or value.code = 'ARMtbd' or value.code = 'C99079' or value.code = 'STAtbd' or value.code = 'STCtbd' or value.code = 'SPtbd' or value.code = 'TRtbd' or value.code = 'TOtbd'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionCodeVS(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code VS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionCodeVS(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionCodeVS(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_CODE_VS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionCodeVS", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionEffectiveTime(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionEffectiveTime(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionEffectiveTime(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionEffectiveTime(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionEffectiveTime(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionNegationInd(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionNegationInd(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionNegationInd(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionNegationInd(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionNegationInd(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_NEGATION_IND,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDataCollectionEventStudyDay(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionEventStudyDay(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateDataCollectionEventStudyDay(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Event Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataCollectionEventStudyDay(DataCollection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dataCollection The receiving '<em><b>Data Collection</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDataCollectionEventStudyDay(DataCollection dataCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.DATA_COLLECTION);
			try {
				VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dataCollection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.DATA_COLLECTION__DATA_COLLECTION_EVENT_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataCollectionEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dataCollection, context) }),
						 new Object [] { dataCollection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventStudyDay(DataCollection) <em>Get Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(DataCollection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventStudyDay))->asSequence()->any(true).oclAsType(sdtm::EventStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getEventStudyDay(DataCollection) <em>Get Event Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(DataCollection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventStudyDay getEventStudyDay(DataCollection dataCollection) {
		if (GET_EVENT_STUDY_DAY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.DATA_COLLECTION, SdtmPackage.Literals.DATA_COLLECTION.getEAllOperations().get(60));
			try {
				GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
		return (EventStudyDay) query.evaluate(dataCollection);
	}

} // DataCollectionOperations