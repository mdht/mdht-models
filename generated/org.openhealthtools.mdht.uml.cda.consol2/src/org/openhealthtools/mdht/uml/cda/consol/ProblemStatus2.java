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
 * A representation of the model object '<em><b>Problem Status2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemStatus2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemStatus2TemplateId ProblemStatusText ProblemStatusValue' templateId.root='2.16.840.1.113883.10.20.22.4.6' templateId.extension='2019-06-20' constraints.validation.info='ProblemStatusTextReference ProblemStatusReferenceValue ProblemStatusTextReferenceValue' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProblemStatus2 extends ProblemStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.6\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProblemStatus2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatus2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatus2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProblemStatus2
