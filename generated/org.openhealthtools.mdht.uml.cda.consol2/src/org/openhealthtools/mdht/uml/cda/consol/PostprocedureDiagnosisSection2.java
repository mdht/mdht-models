/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postprocedure Diagnosis Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPostprocedureDiagnosisSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PostprocedureDiagnosisSection2TemplateId PostprocedureDiagnosisSectionCode PostprocedureDiagnosisSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.36' templateId.extension='2015-08-01' constraints.validation.dependOn.PostprocedureDiagnosisSectionCode='PostprocedureDiagnosisSectionCodeP' constraints.validation.warning='PostprocedureDiagnosisSectionPostprocedureDiagnosis'"
 *        annotation="duplicates"
 * @generated
 */
public interface PostprocedureDiagnosisSection2 extends PostprocedureDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.36\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePostprocedureDiagnosisSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PostprocedureDiagnosis2)'"
	 * @generated
	 */
	PostprocedureDiagnosis2 getConsolPostprocedureDiagnosis2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PostprocedureDiagnosisSection2
